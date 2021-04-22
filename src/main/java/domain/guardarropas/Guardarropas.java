package domain.guardarropas;

import domain.prendas.Prenda;

import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas;

    public void cargarPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }

    public List<Atuendo> atuendosAdecuados(){
        //En esta funcion mandaremos por parametros los datos a tener encuenta para armar el atuendo
        //TODO
        List<Atuendo> a = null;
        return a;
    }

}
