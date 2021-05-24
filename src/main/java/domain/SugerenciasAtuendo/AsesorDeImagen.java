package domain.SugerenciasAtuendo;

import ApiClima.ProveedorClima;
import domain.Caracteristicas.Categoria;
import domain.ConjuntosDePrenda.Atuendo;
import domain.Prendas.Prenda;
import domain.guardarropas.Guardarropas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AsesorDeImagen {
    ProveedorClima miProveedor;

    public AsesorDeImagen(ProveedorClima miProveedor) {
        this.miProveedor = miProveedor;
    }

    public Atuendo sugerirAtuendo(Guardarropas unGuardarropas){
        return new Atuendo(this.fabricarParteSuperior(unGuardarropas),this.fabricarParteInferior(unGuardarropas),fabricarAccesorio(unGuardarropas),this.fabricarCalzado(unGuardarropas));
    }

    public void setProveedorClima(ProveedorClima unProveedor) {
        miProveedor = unProveedor;
    }

    public double getTemperatura(){
        return miProveedor.getTemperatura();
    }

    private Optional<Prenda> fabricarParteSuperior(Guardarropas unGuardarropas){
        return unaPrendaQueCumple(Categoria.PARTE_SUPERIOR, unGuardarropas);
    }
    private Optional<Prenda> fabricarParteInferior(Guardarropas unGuardarropas){
        return unaPrendaQueCumple(Categoria.PARTE_INFERIOR, unGuardarropas);
    }
    private Optional<Prenda> fabricarAccesorio(Guardarropas unGuardarropas){
        return unaPrendaQueCumple(Categoria.ACCESORIOS, unGuardarropas);
    }
    private Optional<Prenda> fabricarCalzado(Guardarropas unGuardarropas){
        return unaPrendaQueCumple(Categoria.CALZADO, unGuardarropas);
    }

    public Optional<Prenda> unaPrendaQueCumple(Categoria unaCat, Guardarropas unGuardarropa) {
        return obtenerListaDeCategoria(unaCat, unGuardarropa).stream().filter(prenda -> prenda.temperaturaAceptable(miProveedor.getTemperatura())).collect(Collectors.toList()).stream().findAny();
    }

    public List<Prenda> obtenerListaDeCategoria(Categoria categoria, Guardarropas unGuardarropa){
        return unGuardarropa.getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
    }
}
