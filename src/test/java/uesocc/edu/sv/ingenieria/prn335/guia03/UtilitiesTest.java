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
 * @author juanca
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
    public void probarMetodogetResume() {
        String fraseEsperada = "Bienvenidos a la mat";
        
        String resultado = servicio.getResume(fraseEsperada);
        Assert.assertEquals(fraseEsperada, resultado);
    }
    
    @Test
    public void probarMetodoCapitalizar() {
        String fraseEsperada2 = "Pruebas De Unidad Con Unit & Arquillian";
        
        String resultado = servicio.capitalizar(fraseEsperada2);
        Assert.assertEquals(fraseEsperada2, resultado);
    }
    
        @Test
    public void probarMetodoContar() {
        int fraseEsperada3= 1;
        String frase="materia";
        int resultado = servicio.contarCoincidencias(frase, frase);
        Assert.assertEquals(fraseEsperada3, resultado);
    }
    

}
