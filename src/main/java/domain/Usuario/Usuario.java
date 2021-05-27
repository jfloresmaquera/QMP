package domain.Usuario;

import Exceptions.DomainExceptioGuardarropa;
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

    public void compartirGuardarropaCon(Usuario usuario, GuardarropasCompartido miGuardarropasCompartido){
        controlarGuardarropasCompartidoPropio(miGuardarropasCompartido);
        usuario.agregarGuardarropaCompartido(miGuardarropasCompartido);
    }

    public void hacerSugerenciaPrendaAgregarEnGuardarropas(Prenda unaPrenda, GuardarropasCompartido unGuardarropasComp){
        controlarGuardarropasCompartidoConUsuario(unGuardarropasComp);
        unGuardarropasComp.agregarSugerenciaAgregar(unaPrenda);
    }

    public void hacerSugerenciaPrendaQuitarEnGuardarropas(Prenda unaPrenda, GuardarropasCompartido unGuardarropasComp){
        controlarGuardarropasCompartidoConUsuario(unGuardarropasComp);
        unGuardarropasComp.agregarSugerenciaQuitar(unaPrenda);
    }

    public List<SugerenciaPrenda> verSugerenciasDeGuardarropas(GuardarropasCompartido miGuardarropasComp){
        this.controlarGuardarropasCompartidoPropio(miGuardarropasComp);
        return miGuardarropasComp.getSugerencias();
    }

    public void aceptarSugerencia(GuardarropasCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
        this.controlarGuardarropasCompartidoPropio(miGuardarropaComp);
        unaSugerencia.aceptarSugerencia(miGuardarropaComp);
    }

    public void rechazarSugerencia(GuardarropasCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
        this.controlarGuardarropasCompartidoPropio(miGuardarropaComp);
        unaSugerencia.rechazarSugerencia(miGuardarropaComp);
    }

    public void deshacerSugerencia(GuardarropasCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
        this.controlarGuardarropasCompartidoPropio(miGuardarropaComp);
        unaSugerencia.deshacerSugerencia(miGuardarropaComp);
    }

    public void controlarGuardarropasCompartidoPropio(GuardarropasCompartido miGuardarropaComp){
        if(!misGuardarropasCompartidos.contains(miGuardarropaComp)) throw new DomainExceptioGuardarropa("Usuario no es propietario del guardarropas compartido");
    }

    public void controlarGuardarropasCompartidoConUsuario(GuardarropasCompartido unGuardarropasComp){
        if(!otrosGuardarropasCompartidos.contains(unGuardarropasComp)) throw new DomainExceptioGuardarropa("Usuario no tiene acceso a este guardarropas");
    }
}
