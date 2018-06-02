/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javieis;

/**
 *
 * @author mike
 */
public class ConteoCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "esta es una prueba para el conteo de palabras, caracteres y espacios en blanco $$3^";
        generar_conteo(frase);
    }
    
    /**
     *
     * @param frase Frase que se va a contar
     */
    public static void generar_conteo(String frase){
        int caracteres = contar_caracteres(frase);
        int espacios = contar_espacios(frase);
        int palabras = contar_palabras(frase);
        
        System.out.println("Caracteres: "+caracteres);
        System.out.println("Palabras: "+palabras);
        System.out.println("Espacios en blanco: "+espacios);

    }
    
    /**
     *
     * @param frase Frase a contar los caracteres
     * @return Cantidad de caracteres de la frase
     */
    public static int contar_caracteres (String frase){
        return frase.length();
    }
    
    /**
     *
     * @param frase Frase a contar los espacios
     * @return cantidad de espacios que tiene la frase
     */
    public static int contar_espacios(String frase ){
        return frase.length() - frase.replaceAll(" ","").length();
    }
    
    /**
     *
     * @param frase Frase a contar las palabras
     * @return Canidad de palabras de la frase
     */
    public static int contar_palabras(String frase){
        return frase.split(" ").length;
    }
    
    
}
