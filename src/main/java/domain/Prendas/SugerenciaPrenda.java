package domain.Prendas;

import Exceptions.DomainExceptionSugerencia;
import domain.guardarropas.GuardarropasCompartido;

public abstract class SugerenciaPrenda {
    Prenda prenda;
    EstadoSugerencia estado;

    public SugerenciaPrenda(Prenda prenda, EstadoSugerencia estado) {
        this.prenda = prenda;
        this.estado = estado;
    }

    public void aceptarSugerencia(GuardarropasCompartido unGuardarropasComp){
        unGuardarropasComp.controlarExistenciaSugerencia(this);
        if(this.estado.equals(EstadoSugerencia.ACEPTADO)) throw new DomainExceptionSugerencia("La sugerencia ya a sido aceptada");
        this.realizarAccionSugerida(unGuardarropasComp);
    }

    public void rechazarSugerencia(GuardarropasCompartido unGuardarropasComp){
        unGuardarropasComp.controlarExistenciaSugerencia(this);
        this.estado = EstadoSugerencia.RECHAZADO;
    }

    abstract public void realizarAccionSugerida(GuardarropasCompartido unGuardarropaComp);

    public void deshacerSugerencia(GuardarropasCompartido unGuardarropaComp){
        unGuardarropaComp.controlarExistenciaSugerencia(this);
        if(!this.estado.equals(EstadoSugerencia.ACEPTADO)) throw new DomainExceptionSugerencia("La sugerencia no a sido aceptada");
        this.deshacerAccionSugerida(unGuardarropaComp);
    }

    abstract void deshacerAccionSugerida(GuardarropasCompartido unGuardarropaComp);
}
