package ApiClima;

public class ProvedorClima {
    //al hacerlo un singleton solo le cambiaremos la ApiClima asociada para consultar los datos necesarios

    ServicioMeteorologico servicioMeteoro;
    private static final ProvedorClima INSTANCE = new ProvedorClima();

    public static ProvedorClima instance() {
        return INSTANCE;
    }

    public double getTemperatura(){
        return servicioMeteoro.getTemperatura();
    }

    public void setServicioMeteorologico(ServicioMeteorologico otroServicio) {
        this.servicioMeteoro = otroServicio;
        //otroServicio.setFechaInicial();
    }

}
