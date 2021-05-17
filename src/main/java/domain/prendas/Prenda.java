package domain.prendas;

import domain.Caracteristicas.*;

public class Prenda {
    private TipoDePrenda tipoPrenda;
    private Material material;

    Prenda(TipoDePrenda tipoPrenda, Material material) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
    }

    public Categoria categoria() {
        return tipoPrenda.getCategoria();
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
}
