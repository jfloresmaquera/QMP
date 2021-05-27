package domain.Prendas;

import domain.guardarropas.GuardarropasCompartido;

public class SugerenciaPrendaQuitar extends SugerenciaPrenda{
    public SugerenciaPrendaQuitar(Prenda prenda, EstadoSugerencia estadoAceptado) {
        super(prenda, estadoAceptado);
    }

    public void realizarAccionSugerida(GuardarropasCompartido unGuardarropaComp){
        unGuardarropaComp.quitarPrenda(this.prenda);
    }

    public void deshacerAccionSugerida(GuardarropasCompartido unGuardarropaComp){
        unGuardarropaComp.agregarPrenda(this.prenda);
    }
}
