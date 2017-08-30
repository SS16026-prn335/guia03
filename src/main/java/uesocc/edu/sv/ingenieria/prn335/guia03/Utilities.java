package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;


/**
 *
 * @author jcsantos
 */

@LocalBean
@Dependent
public class Utilities implements Serializable{
    
    /**
     * 
     * @param texto Cadena de texto que contiene la introducción de un determinado post.
     * @return Las primeras 20 letras del texto recibido.
     */
    public String getResume(String texto) {
       char caracter=' ';
       String frase="";
        String fraseCompleta="Bienvenidos a la materia de programacion 3 donde nos estan violando";
        for(int i=0; i<20; i++){
            caracter=texto.charAt(i);
            frase+=caracter;
        }
         return frase;
    }
    /**
     * 
     * @param texto Cadena de texto que contiene el título de un determinado post.
     * @return El texto que se ha recibido con cada palabra capitalizada y sin dobles espacios.
     */
    public String capitalizar(String texto) {
        texto="pruebas de unidad con unit & arquillian";
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < texto.length(); i++) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            if (caracteres[i] == ' ') {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        texto = String.valueOf(caracteres);
        texto = (texto.replace("  ", " "));
        return texto;
    }
    
    /**
     * 
     * @param frase cadena de texto que contiene la frase a buscar.
     * @param cadena cadena de texto donde se buscaran las coincidencias.
     * @return La cantidad de coincidencias de la frase en el texto recibido.
     */
    public int contarCoincidencias(String cadena, String frase) {   
    String Cadena = "Bienvenidos a la materia de programacion 3 del ciclo II 2017";
    frase = "materia";
    int i = 0,contador = 0;
    while (i != -1){
    i = Cadena.indexOf(frase,i);
    if (i != -1){
    i++;
    contador++;
}
}
return contador;
}
}

    
