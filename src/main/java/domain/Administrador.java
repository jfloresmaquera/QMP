package domain;

import ApiClima.ApiClima;
import ApiClima.Clima;

public class Administrador {
    public void cambiarServicioObtencionClima(ApiClima unaAPI) {
        Clima.instance().setUnaAPIClima(unaAPI);
    }

}
