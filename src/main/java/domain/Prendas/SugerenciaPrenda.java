package domain.Prendas;

public class SugerenciaPrenda {
    private Prenda prenda;
    private AccionAPrenda accion;
    private EstadoSugerencia estado;

    public SugerenciaPrenda(Prenda prenda, AccionAPrenda accion, EstadoSugerencia estadoAceptado) {
        this.prenda = prenda;
        this.accion = accion;
        this.estado = estadoAceptado;
    }

    public void cambiarEstado(EstadoSugerencia nuevoEstado){
        estado = nuevoEstado;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public AccionAPrenda getAccion() {
        return accion;
    }

    public EstadoSugerencia getEstado() {
        return estado;
    }
}
