package domain.ConjuntosDePrenda;

import domain.Prendas.Prenda;

public class Uniforme {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda calzado;

    public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }
}
