package domain.prendas;

public class Prenda {
    private Tipo tipoPrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;

    Prenda(Tipo tipoPrenda, Material material, Color colorPrincipal, Color colorSecundario) throws Exception{
        //TODO
        //los puse en el constructor de forma que solamente deje cargar prendas con los los datos necesarios y que lance exception en caso de un dato faltante
        // con el color secundario no es necesario el campo, estaba pensando en hacer un proceso el no lanzara exception si llenaba los 3 primeros campos

        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;

    }

    public Categoria categoria(){
        return tipoPrenda.getCategoria();
    }


}
