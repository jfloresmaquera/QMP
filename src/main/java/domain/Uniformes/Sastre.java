package domain.Uniformes;

import domain.prendas.Prenda;
import domain.prendas.Uniforme;

abstract public class Sastre {
    public Uniforme fabricarUniforme(){
        return new Uniforme(this.fabricarParteSuperior(),this.fabricarParteInferior(),this.fabricarCalzado());
    }

    protected abstract Prenda fabricarParteSuperior();
    protected abstract Prenda fabricarParteInferior();
    protected abstract Prenda fabricarCalzado();
}
