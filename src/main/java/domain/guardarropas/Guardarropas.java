package domain.guardarropas;

import domain.ConjuntosDePrenda.Atuendo;
import domain.Prendas.BorradorPrenda;
import domain.Prendas.Prenda;
import domain.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas;
    private BorradorPrenda ultimoBorradorPrenda;
    //se le puede agregar el atributo criterio como enum o como string : ropa de viaje, ropa de entrecasa, etc

    public Guardarropas() {
        this.prendas = new ArrayList<Prenda>();
    }

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