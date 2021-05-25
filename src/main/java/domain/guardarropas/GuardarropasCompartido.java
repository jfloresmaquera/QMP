package domain.guardarropas;

import Exceptions.DomainGuardarropa;
import domain.Prendas.AccionAPrenda;
import domain.Prendas.EstadoSugerencia;
import domain.Prendas.Prenda;
import domain.Prendas.SugerenciaPrenda;
import domain.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GuardarropasCompartido extends Guardarropas{
    //Uso herencia ya que Guardarropas nunca va a pasar a ser compartido: o es propio o es compartido
    List<SugerenciaPrenda> sugerencias;

    public GuardarropasCompartido() {
        super();
        sugerencias = new ArrayList<SugerenciaPrenda>();
    }

    public void agregarSugerencia(Prenda unaPrenda, AccionAPrenda unaSugerencia){
        sugerencias.add(new SugerenciaPrenda(unaPrenda,unaSugerencia, EstadoSugerencia.ENPROCESO));
    }

    public List<SugerenciaPrenda> getSugerencias(){
        return sugerencias;
    }

    public void cambiarEstadoSugerencia(int posicion, EstadoSugerencia nuevoEstado){
        sugerencias.get(posicion).cambiarEstado(nuevoEstado);
        if(nuevoEstado.equals(EstadoSugerencia.ACEPTADO)) realizarSugerencia(sugerencias.get(posicion));
    }

    public void realizarSugerencia(SugerenciaPrenda sugerencia){
        if(sugerencia.getAccion().equals(AccionAPrenda.AGREGAR)) this.agregarPrenda(sugerencia.getPrenda());
        if(sugerencia.getAccion().equals(AccionAPrenda.QUITAR)) this.quitarPrenda(sugerencia.getPrenda());
    }

    public void deshacerSugerencia(int indexSugerencia){
        SugerenciaPrenda sugerenciaADeshacer = sugerencias.get(indexSugerencia);
        if(!sugerenciaADeshacer.getEstado().equals(EstadoSugerencia.ACEPTADO)) throw  new DomainGuardarropa("La sugerencia no estaba aceptada");
        sugerenciaADeshacer.setEstado(EstadoSugerencia.ENPROCESO);
        if(sugerenciaADeshacer.getAccion().equals(AccionAPrenda.AGREGAR)) this.quitarPrenda(sugerenciaADeshacer.getPrenda());
        if(sugerenciaADeshacer.getAccion().equals(AccionAPrenda.QUITAR)) this.agregarPrenda(sugerenciaADeshacer.getPrenda());
    }
}