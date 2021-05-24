package domain.guardarropas;

import domain.ConjuntosDePrenda.Atuendo;
import domain.Prendas.BorradorPrenda;
import domain.Prendas.Prenda;

import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas;
    private BorradorPrenda ultimoBorradorPrenda;

    public void guardarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public void guardarUltimoBorradorPrenda(BorradorPrenda unBorradorPrenda){
        this.ultimoBorradorPrenda = ultimoBorradorPrenda;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }
}
