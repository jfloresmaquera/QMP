package domain.prendas;

public class TipoDePrenda {
    private static TipoDePrenda zapato(){
        return new TipoDePrenda(Categoria.CALZADO);
    }
    private static TipoDePrenda chomba() {
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    }
    private static TipoDePrenda paniuelo(){
        return new TipoDePrenda(Categoria.ACCESORIOS);
    }
    private static TipoDePrenda remera(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    }
    private static TipoDePrenda pantalon(){
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
