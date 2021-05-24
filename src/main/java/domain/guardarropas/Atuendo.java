package domain.guardarropas;

import ApiClima.ProvedorClima;
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

    Atuendo(){
        generarSugerenciaDeAtuendo();
    }
    public void generarSugerenciaDeAtuendo() {
        superior = unaQueCumple(Categoria.PARTE_SUPERIOR);
        inferior =  unaQueCumple(Categoria.PARTE_INFERIOR);
        accesorio =  unaQueCumple(Categoria.ACCESORIOS);
        calzado =  unaQueCumple(Categoria.CALZADO);
    }

    public Optional<Prenda> unaQueCumple(Categoria unaCat) {
        return obtenerListaDeCategoria(unaCat).stream().filter(prenda -> prenda.temperaturaAceptable(ProvedorClima.instance().getTemperatura())).collect(Collectors.toList()).stream().findAny();
    }

    public List<Prenda> obtenerListaDeCategoria(Categoria categoria){
        return Guardarropas.instance().getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
    }

}