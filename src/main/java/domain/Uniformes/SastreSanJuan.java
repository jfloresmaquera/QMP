package domain.Uniformes;

import domain.Caracteristicas.Color;
import domain.Caracteristicas.TipoDePrenda;
import domain.Caracteristicas.TipoMaterial;
import domain.prendas.BorradorPrenda;
import domain.prendas.Prenda;

public class SastreSanJuan extends Sastre {

    protected Prenda fabricarParteSuperior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.chomba());
        borrador.setColorPrincipal(new Color(0,143,57));
        borrador.setTipoMaterial(TipoMaterial.PIQUE);
        return borrador.crearPrenda();
    }

    protected Prenda fabricarParteInferior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.pantalon());
        borrador.setColorPrincipal(new Color(93,93,93));
        borrador.setTipoMaterial(TipoMaterial.ACETATO);
        return borrador.crearPrenda();
    }

    protected Prenda fabricarCalzado() {
        BorradorPrenda borrador = new BorradorPrenda(TipoDePrenda.zapatillas());
        borrador.setColorPrincipal(new Color(255,255,255));
        borrador.setTipoMaterial(TipoMaterial.CUERO);
        return borrador.crearPrenda();
    }
}
