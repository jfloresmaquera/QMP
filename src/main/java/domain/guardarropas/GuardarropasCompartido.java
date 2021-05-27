package domain.guardarropas;

import Exceptions.DomainExceptioGuardarropa;
import domain.Prendas.*;

import java.util.ArrayList;
import java.util.List;

public class GuardarropasCompartido extends Guardarropas{
    private List<SugerenciaPrenda> sugerencias;

    public GuardarropasCompartido() {
        super();
        sugerencias = new ArrayList<SugerenciaPrenda>();
    }

    public void agregarSugerenciaAgregar(Prenda unaPrenda){
        sugerencias.add(new SugerenciaPrendaAgregar(unaPrenda, EstadoSugerencia.ENPROCESO));
    }

    public void agregarSugerenciaQuitar(Prenda unaPrenda){
        sugerencias.add(new SugerenciaPrendaQuitar(unaPrenda, EstadoSugerencia.ENPROCESO));
    }

    public List<SugerenciaPrenda> getSugerencias(){
        return sugerencias;
    }


    public void controlarExistenciaSugerencia(SugerenciaPrenda unaSugerencia){
        if(!sugerencias.contains(unaSugerencia)) throw new DomainExceptioGuardarropa("La sugerencia no existe en el guardarropas");
    }
}