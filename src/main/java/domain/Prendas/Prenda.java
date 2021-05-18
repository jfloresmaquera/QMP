package domain.Prendas;

import domain.Caracteristicas.*;

public class Prenda {
    private TipoDePrenda tipoPrenda;
    private Material material;

    Prenda(TipoDePrenda tipoPrenda, Material material) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
    }

    public TipoMaterial getTipoMaterial() {
        return material.getTipoMaterial();
    }

    public Trama getTrama() {
        return material.getTrama();
    }

    public Color getColorPrincipal() {
        return material.getColorPrincipal();
    }

    public Color getColorSecundario() {
        return material.getColorSecundario();
    }

    public Categoria getCategoria(){
        return tipoPrenda.getCategoria();
    }

    public boolean temperaturaAceptable(double unaTemp) {
        return tipoPrenda.temperaturaAceptable(unaTemp);
    }
}
