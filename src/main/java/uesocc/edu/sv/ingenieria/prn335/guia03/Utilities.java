package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author sandoval_santos
 */

@LocalBean
@Dependent
public class Utilities implements Serializable{
    
    /**
     * Selecciona y devuelva los primeros 20 caracteres de un texto
     * @param texto Cadena de texto que contiene la introducción de un determinado post.
     * @return Las primeras 20 letras del texto recibido.
     */
     public String getResume(String texto) {
        int tamaño=20;
        if (texto==null) {
             return null;
            }else{
             
        char c = ' ';
        String frase = "";
            if (texto.length()<20) {
                tamaño=texto.length();
            }
        //for para limitar el tamaño de la cadena de texto
        for (int i = 0; i < tamaño; i++) {
            //con charAt me voy a la pocision de la cadena
            c = texto.charAt(i);
            //voy concatenando los caracteres para formar la frase limitada
            frase += c;
            }
        
        return frase;
        }
    }

    /**
     *capitalizar es el metodo en el cual elimina los dobles espacios y deja la primera letra de cada palabra mayusculas
     * @param texto - es el texto el cual queremos capitalizar y quitar dobles espacios
     * @return - retorna el texto ya capitalizado y sin dobles espacios
     */
    public String capitalizar(String texto) {
        int cont = 0;
        String frase = "";
        if (texto=="") {
             return "";
            }
        if (texto==null) {
             return null;
            }else{
            String palabra="";
        palabra=texto.toLowerCase();

        char[] caracteres = palabra.toCharArray();
        // for pasando por todas las letras
        for (int i = 0; i < palabra.length(); i++) {
            //la primera letra es mayuscula
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            // Reemplazamos por mayuscula
            if (caracteres[i] == ' ') {
                int p = i;
                cont = 0;
                while (caracteres[(p)] == ' ') {
                    p++;
                    cont += 1;
                }
                if (cont >= 2) {
                    continue;
                } else {
                    caracteres[i + cont] = Character.toUpperCase(caracteres[i + cont]);
                }
            }
            frase += caracteres[i];
        }
        return frase;
        }
    }

    /**
     *metodo para contar las coincidencias de un palabra que el usuario pone en una frase que el usuario selecciona 
     * @param frase - es la frase completa en la cual buscaremos
     * @param texto - es el texto buscado en la frase
     * @return - retorna el numero de veces que encontro el texto buscado en la frase
     */
    public int contarCoincidencias(String frase, String texto) {

        // Contador de ocurrencias 
        int contador = 0;
        if (frase==null) {
            return contador;
        }
        while (frase.indexOf(texto) > -1) {
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length());
            contador++;
        }

        return contador;

    }
}

    
