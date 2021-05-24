package domain.ConjuntosDePrenda;

import domain.Caracteristicas.Categoria;
import domain.Prendas.Prenda;
import domain.guardarropas.Guardarropas;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Atuendo {
    Optional<Prenda> superior;
    Optional<Prenda> inferior;
    Optional<Prenda> accesorio;
    Optional<Prenda> calzado;

    public Atuendo(Optional<Prenda> superior, Optional<Prenda> inferior, Optional<Prenda> accesorio, Optional<Prenda> calzado) {
        this.superior = superior;
        this.inferior = inferior;
        this.accesorio = accesorio;
        this.calzado = calzado;
    }
}