package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author jcsantos
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {

    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class)
        .addClass(Utilities.class)
        .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    
    @Inject
    private Utilities servicio;

    @Test
   public void probarGetResume() {
        System.out.println("getResume prueba 1");
        String texto = "Bienvenidos a la materia de Programación 3 Ciclo II 2017 ";
        String textoEsperado = "Bienvenidos a la mat";
        String resultado = servicio.getResume(texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
   public void probarGetResume2() {
        System.out.println("getResume prueba 2");
        String texto = "Hola mundo!";
        String textoEsperado = "Hola mundo!";
        String resultado = servicio.getResume(texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
   public void probarGetResume3() {
        System.out.println("getResume prueba 3");
        String texto = null;
        String textoEsperado = null;
        String resultado = servicio.getResume(texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    @Test
    public void pruebaCapitalizar() {
        System.out.println("capitalizar prueba 1");
        String texto = "prueBas  de UNIDAD   con  JUnit  & arQuillian";//
        String textoEsperado = "Pruebas De Unidad Con Junit & Arquillian";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(textoEsperado, resultado);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void pruebaCapitalizar2() {
        System.out.println("capitalizar prueba 2");
        String texto = "";
        String textoEsperado = "";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(textoEsperado, resultado);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void pruebaCapitalizar3() {
        System.out.println("capitalizar prueba 3");
        String texto = null;
        String textoEsperado = null;
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(textoEsperado, resultado);
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void pruebaContarCoincidencias() {
        System.out.println("contarCoincidencias prueba 1");
        String frase = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        String texto = "2017";
        int textoEsperado = 1;
        int resultado = servicio.contarCoincidencias(frase, texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void pruebaContarCoincidencias2() {
        System.out.println("contarCoincidencias prueba 2");
        String frase = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        String texto = "MA";
        int textoEsperado = 2;
        int resultado = servicio.contarCoincidencias(frase, texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void pruebaContarCoincidencias3() {
        System.out.println("contarCoincidencias prueba 3");
        String frase = null;
        String texto = "bienvenidos";
        int textoEsperado = 0;
        int resultado = servicio.contarCoincidencias(frase, texto);
        Assert.assertEquals(textoEsperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
