package domain.Caracteristicas;

public class TipoDePrenda {
    public static TipoDePrenda zapatillas(){
        return new TipoDePrenda(Categoria.CALZADO,-10,30);
    }
    public static TipoDePrenda zapato(){
        return new TipoDePrenda(Categoria.CALZADO, 5, 50);
    }
    public static TipoDePrenda chomba(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR, 5, 25);
    }
    public static TipoDePrenda gorro(){
        return new TipoDePrenda(Categoria.ACCESORIOS, 10, 30);
    }
    public static TipoDePrenda remeraMangaLarga(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR,-10,20);
    }
    public static TipoDePrenda remeraMangaCorta(){
        return new TipoDePrenda(Categoria.PARTE_SUPERIOR,15,30);
    }
    public static TipoDePrenda pantalon(){
        return new TipoDePrenda(Categoria.PARTE_INFERIOR, 0, 28);
    }
    public static TipoDePrenda camisa() { return new TipoDePrenda(Categoria.PARTE_SUPERIOR, 10,25);}

    private Categoria categoria;
    private double tempMax;
    private double tempMin;

    public TipoDePrenda(Categoria categoria, double tempMax, double tempMin) {
        this.categoria = categoria;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public boolean temperaturaAceptable(double unaTemp){
        return unaTemp >= tempMin && unaTemp <= tempMax;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
