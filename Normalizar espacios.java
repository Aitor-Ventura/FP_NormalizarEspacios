package es.ulpgc.eii.strings;

/*  Aitor Ventura Delgado
    19.02.2019
    
    Crearemos un metodo que removerá espacios del principio y del final
    de una cadena dada, y además reemplazará todos aquellos espacios múltiples que
    se encuentren en medio de la cadena por uno solo. */


public class StringUtils {
    public static String normalize(String s1){
        String res = "";    //Creamos String resultante
        //Hacemos que se reemplacen todos los caracteres de espacios en medio de la cadena y quitamos
        //los del principio y los del final
        s1 = s1.replaceAll("\\s+"," ").trim(); 
        res += s1;  //la String res será la resultante de la s1 modificada
        
        return res; //devolvemos la String resultante
    }
}