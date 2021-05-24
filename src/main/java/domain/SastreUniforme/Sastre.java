package domain.SastreUniforme;

import domain.Prendas.Prenda;
import domain.ConjuntosDePrenda.Uniforme;

abstract public class Sastre {
    public Uniforme fabricarUniforme(){
        return new Uniforme(this.fabricarParteSuperior(),this.fabricarParteInferior(),this.fabricarCalzado());
    }

    protected abstract Prenda fabricarParteSuperior();
    protected abstract Prenda fabricarParteInferior();
    protected abstract Prenda fabricarCalzado();
}
