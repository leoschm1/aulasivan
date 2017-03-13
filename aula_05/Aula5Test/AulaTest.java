package Aula5Test;

import org.junit.Assert;
import org.junit.Test;

import Aula5.Aula;


public class AulaTest {
	
	@Test
	public void invertTest() {
		Aula aula = new Aula();
		String resultado = aula.inverter("ola");
		Assert.assertEquals("alo", resultado);
	}

}
