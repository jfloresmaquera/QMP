package domain.Prendas;

import domain.guardarropas.GuardarropasCompartido;

public class SugerenciaPrendaAgregar extends SugerenciaPrenda{
    public SugerenciaPrendaAgregar(Prenda prenda, EstadoSugerencia estadoAceptado) {
        super(prenda, estadoAceptado);
    }

    public void realizarAccionSugerida(GuardarropasCompartido unGuardarropaComp){
        unGuardarropaComp.agregarPrenda(this.prenda);
    }

    public void deshacerAccionSugerida(GuardarropasCompartido unGuardarropaComp){
        unGuardarropaComp.quitarPrenda(this.prenda);
    }
}
