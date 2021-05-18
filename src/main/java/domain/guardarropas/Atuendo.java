package domain.guardarropas;

import domain.Caracteristicas.Categoria;
import domain.Prendas.Prenda;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Atuendo {
    Optional<Prenda> superior;
    Optional<Prenda> inferior;
    Optional<Prenda> accesorio;
    Optional<Prenda> calzado;
    public Atuendo generarSugerenciaDeAtuendo(double temp) {
        superior = unaQueCumple(Categoria.PARTE_SUPERIOR,temp);
        inferior =  unaQueCumple(Categoria.PARTE_INFERIOR,temp);
        accesorio =  unaQueCumple(Categoria.ACCESORIOS,temp);
        calzado =  unaQueCumple(Categoria.CALZADO,temp);
        return this;
    }

    public Optional<Prenda> unaQueCumple(Categoria unaCat, double temp) {
        return obtenerListaDeCategoria(unaCat).stream().filter(prenda -> prenda.temperaturaAceptable(temp)).collect(Collectors.toList()).stream().findAny();
    }

    public List<Prenda> obtenerListaDeCategoria(Categoria categoria){
        return Guardarropas.instance().getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
    }

}

