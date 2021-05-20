package ApiClima;

import java.util.Map;
import java.util.List;

public interface ApiClima {
    //segun el enunciado  se van a tener diferentes Apis de Climas en e futuro que el administrador pondra
    List<Map<String, Object>> getWeather(String ciudad);
    public double costoDeConsultasAdicionales();

    public void controlarCantidadMaximaDeConsultas();

    public void setFechaInicial();
}
