package domain.Caracteristicas;

import java.util.Objects;

public class Material {
    private TipoMaterial tipoMaterial;
    private Trama trama;
    private Color colorPrincipal;
    private Color colorSecundario;

    public Material(TipoMaterial tipoMaterial, Trama trama, Color colorPrincipal) {
        validaciondeTrama(trama);
        this.tipoMaterial = tipoMaterial;
        this.colorPrincipal = colorPrincipal;
    }

    public void validaciondeTrama(Trama trama){
        //TODO podemos hacer un try and catch para sacar el if
        //Objects.requireNonNull(trama);
        if(trama==null) {
            trama = Trama.LISA;
        }else
            this.trama= trama;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public Trama getTrama() {
        return trama;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        Objects.requireNonNull(colorSecundario,"No hay color secundario asignado");
        return colorSecundario;
    }
}
