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
public class JavieIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "esta es una prueba para el conteo de palabras, caracteres y espacios en blanco $$3^";
        generar_conteo(frase);
    }
    
    public static void generar_conteo(String frase){
        int caracteres = frase.length();
        int espacios = frase.length() - frase.replaceAll(" ","").length();
        int palabras = frase.split(" ").length;
        
        System.out.println("Caracteres: "+caracteres);
        System.out.println("Palabras: "+palabras);
        System.out.println("Espacios en blanco: "+espacios);

    }
    
}
