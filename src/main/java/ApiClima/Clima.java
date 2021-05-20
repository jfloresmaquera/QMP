package ApiClima;

import java.util.Map;

public class Clima {
    //al hacerlo un singleton solo le cambiaremos la ApiClima asociada para consultar los datos necesarios

    ApiClima unaApiClima;
    private static final Clima INSTANCE = new Clima();

    public static Clima instance() {
        return INSTANCE;
    }

    public Map<String, Object> climaSegunAPISeleccionada() {
        unaApiClima.controlarCantidadMaximaDeConsultas();
        return unaApiClima.getWeather("Buenos Aires, Argentina").get(0);
    }

    public double getTemperatura(){
        return  climaSegunAPISeleccionada().get("Temperature").get("Value");;
    }

    public void setUnaAPIClima(ApiClima unaApiClima) {
        this.unaApiClima = unaApiClima;
        unaApiClima.setFechaInicial();
    }

}
