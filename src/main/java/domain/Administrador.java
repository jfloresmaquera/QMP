package domain;

import ApiClima.ServicioMeteorologico;
import ApiClima.ProvedorClima;

public class Administrador {
    public void cambiarServicioObtencionClima(ServicioMeteorologico unaAPI) {
        ProvedorClima.instance().setServicioMeteorologico(unaAPI);
    }

}
