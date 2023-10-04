package Modelo;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){
        return TEXTO_DEFECTO;
    }
    //Imprimible es el tipo de interfaz e imprimible es un objeto de tipo Imprimible
    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
