package domain.guardarropas;

import domain.Prendas.BorradorPrenda;
import domain.Prendas.Prenda;

import java.util.List;

public class Guardarropas {

    private static final Guardarropas INSTANCE = new Guardarropas();

    private List<Prenda> prendas;
    private BorradorPrenda ultimoBorradorPrenda;

    public static Guardarropas instance(){
        return INSTANCE;
    }

    public void cargarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public void guardarUltimoBorradorPrenda(BorradorPrenda unBorradorPrenda){
        this.ultimoBorradorPrenda = ultimoBorradorPrenda;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }
}
