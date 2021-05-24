package domain.Usuario;

import Exceptions.GuardarropasNoEsPropio;
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

    public void otorgarAccesoGuardarropas(Usuario unUsuario, Guardarropas unGuardarropas){
        if(misGuardarropas.contains(unGuardarropas)) throw new GuardarropasNoEsPropio("El guardarropas pasado por parametro no es de propiedad del Usuario");
    }
}
