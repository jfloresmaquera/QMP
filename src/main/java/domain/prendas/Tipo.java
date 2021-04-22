package domain.prendas;

public class Tipo {
    private Tipos tipo;

    Tipo(Tipos tipo){
        this.tipo = tipo;
    }

    Categoria getCategoria(){
        Categoria a = null;
        /*switch(tipo){
            case(ANTEOJOS_DE_SOL)
                ....
        }*/
        return a;
    }
    //Toda esta parte tmbn la pense en hacer desde el punto de vista de categoria con una interfaz, la cual reciba las clases PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR y ACCESORIOS
    // cada una de estas clases tendria un enum con el mismo nombre que tendria como elementos los tipos de cada uno (remera para la priemra clase, zapatos para la segunda clase,etc)
}
