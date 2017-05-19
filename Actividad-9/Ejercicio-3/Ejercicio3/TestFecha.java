package Ejercicio3;

import org.junit.Test;

import junit.framework.TestCase;

public class TestFecha  extends TestCase{
	
	 private Fecha fechaCorrecta=new Fecha(3 ,4, 2017);
	 private Fecha fechaMal1=new Fecha(3 ,13, 2017);
	 private Fecha fechaMal2=new Fecha(3 ,20, 2017);
	
	@Test
	   public void testValida(){
		this.assertTrue(fechaCorrecta.valida());
		
	}

}
