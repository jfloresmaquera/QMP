package domain.Caracteristicas;

public class TipoDePrenda {
    public static TipoDePrenda zapatos(){
        return new TipoDePrenda(Categoria.CALZADO);
    }
    public static TipoDePrenda zapatillas(){
        return new TipoDePrenda(Categoria.CALZADO);
    }
    public static TipoDePrenda chomba(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    }
    public static TipoDePrenda paniuelo(){
        return new TipoDePrenda(Categoria.ACCESORIOS);
    }
    public static TipoDePrenda remera(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    }
    public static TipoDePrenda pantalon(){
        return new TipoDePrenda(Categoria.PARTE_INFERIOR);
    }

    private Categoria categoria;

    TipoDePrenda( Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
