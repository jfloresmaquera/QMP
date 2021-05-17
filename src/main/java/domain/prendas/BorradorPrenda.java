package domain.prendas;

import domain.guardarropas.Guardarropas;

import java.util.Objects;

public class BorradorPrenda {
    private TipoDePrenda tipoPrenda;
    private TipoMaterial tipoMaterial;
    private Trama trama;
    private Color colorPrincipal;
    private Color colorSecundario;


    public BorradorPrenda(TipoDePrenda tipoPrenda) {
        validarNoNulo(tipoPrenda,"Falta tipo de prenda");
        this.tipoPrenda = tipoPrenda;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        //aca se pueden hacer las validaciones  para evitar elegir materiales inconsistentes con el tipo de prenda
        this.tipoMaterial = tipoMaterial;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Prenda crearPrenda(){
        // aca se pueden hacer las validaciones  para evitar elegir materiales inconsistentes con el tipo de prenda
        validarNoNulo(tipoMaterial," Falta ingresar tipo de Material");
        validarNoNulo(colorPrincipal,"Falta ingresar color principal de material");
        Material auxMaterial = new Material(tipoMaterial,trama,colorPrincipal);
        if(colorSecundario!=null) auxMaterial.setColorSecundario(colorSecundario);
        return new Prenda (tipoPrenda,auxMaterial);
    }

    public void guardarBorrador(){
        Guardarropas.instance().guardarUltimaPrenda(this);
    }

    private <T> void validarNoNulo (T parametro, String message) {
        Objects.requireNonNull(parametro, message);
    }
}
