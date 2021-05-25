package domain.Usuario;

import Exceptions.DomainGuardarropa;
import domain.Prendas.AccionAPrenda;
import domain.Prendas.EstadoSugerencia;
import domain.Prendas.Prenda;
import domain.Prendas.SugerenciaPrenda;
import domain.guardarropas.Guardarropas;
import domain.guardarropas.GuardarropasCompartido;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    List<Guardarropas> misGuardarropas;
    List<GuardarropasCompartido> misGuardarropasCompartidos;
    List<GuardarropasCompartido> otrosGuardarropasCompartidos;

    public Usuario() {
        this.misGuardarropas = new ArrayList<Guardarropas>();
        this.misGuardarropasCompartidos = new ArrayList<GuardarropasCompartido>();
        this.otrosGuardarropasCompartidos = new ArrayList<GuardarropasCompartido>();
    }

    public void crearGuardarropasPropio(){
        misGuardarropas.add(new Guardarropas());
    }

    public void crearGuardarropasCompartidos(List<Usuario> usuariosACompartir){
        GuardarropasCompartido unGuardarropaNuevo = new GuardarropasCompartido();
        misGuardarropasCompartidos.add(unGuardarropaNuevo);
        usuariosACompartir.stream().forEach(usuario->usuario.agregarGuardarropaCompartido(unGuardarropaNuevo));
    }

    public void agregarGuardarropaCompartido(GuardarropasCompartido unGuardarrodaCompartido){
        otrosGuardarropasCompartidos.add(unGuardarrodaCompartido);
    }

    public void hacerSugerenciaPrendaEnGuardarropas(Prenda unaPrenda, GuardarropasCompartido unGuardarropasComp, AccionAPrenda unaAccion){
        if(!otrosGuardarropasCompartidos.contains(unGuardarropasComp)) throw new DomainGuardarropa("Usuario no tiene acceso a este guardarropas");
        unGuardarropasComp.agregarSugerencia(unaPrenda,unaAccion);
    }

    public List<SugerenciaPrenda> verSugerenciasDeGuardarropas(GuardarropasCompartido miGuardarropasComp){
        this.controlarGuardarropasCompartidoPropio(miGuardarropasComp);
        return miGuardarropasComp.getSugerencias();
    }

    public void analisisDeSugerencia(GuardarropasCompartido miGuardarropaComp, int posicionDeSugerencia, EstadoSugerencia nuevoEstado){
        this.controlarGuardarropasCompartidoPropio(miGuardarropaComp);
        //si recibo por parametro una sugerencia, deberia hacer el control de existencia del mismo dentro de la lista de sugerencias del guardarropas
        miGuardarropaComp.cambiarEstadoSugerencia(posicionDeSugerencia, nuevoEstado);
    }

    public void deshacerSugerencia(GuardarropasCompartido miGuardarropaComp, int posicionDeSugerencia){
        this.controlarGuardarropasCompartidoPropio(miGuardarropaComp);
        miGuardarropaComp.deshacerSugerencia(posicionDeSugerencia);
    }

    public void controlarGuardarropasCompartidoPropio(GuardarropasCompartido miGuardarropaComp){
        if(!misGuardarropasCompartidos.contains(miGuardarropaComp)) throw new DomainGuardarropa("Usuario no es propietario del guardarropas compartido");
    }
}
