package ApiClima;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ProveedorClimaAccuWeatherApi implements ProveedorClima {

    private AccuWeatherAPI miApi;
    private Map<String, Object> ultimasRespuestas;
    private Duration periodoDeValidez;
    private LocalDateTime proximaExpiracion;

    public ProveedorClimaAccuWeatherApi() {
        miApi = new AccuWeatherAPI();
        ultimasRespuestas = new HashMap<String, Object>();
        periodoDeValidez = Duration.ofMinutes(150);
        proximaExpiracion = LocalDateTime.now();
    }

    public Map<String, Object> climaSegunAPISeleccionada() {
        if(this.expiro()){
            ultimasRespuestas = miApi.getWeather("Buenos Aires, Argentina").get(0);
            proximaExpiracion = this.proximaExpiracion();
        }
        return ultimasRespuestas;
    }

    public LocalDateTime proximaExpiracion(){
        return LocalDateTime.now().plus(this.periodoDeValidez);
    }

    private boolean expiro() {
        return proximaExpiracion.isBefore(LocalDateTime.now());
    }

    public double getTemperatura(){
        HashMap<String, Object> temp = (HashMap<String, Object>) climaSegunAPISeleccionada().get("Temperature");
        return  (double) temp.get("Value");
    }
}
