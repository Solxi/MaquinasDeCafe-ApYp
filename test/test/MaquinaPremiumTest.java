package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import maquinasDeCafe.MaquinaDeCafe;
import maquinasDeCafe.MaquinaPremium;
import maquinasDeCafe.VasoDeCafe;

public class MaquinaPremiumTest {

	MaquinaDeCafe maquina;

	@Before
	public void setup() {
		maquina = new MaquinaPremium();
	}

	@Test
	public void queDevuelveUnVasoAlServir() { 
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertNotNull(vaso);
	}

	@Test
	public void quePuedeServirUnCafe() {
		Assert.assertTrue(maquina.puedeServir());
	}

	@Test
	public void queSeAgotaElCafe() { //luego de servir 100 cafe ya no puede servir
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		Assert.assertFalse(maquina.puedeServir());
	}

	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() { //prueba que sirve un vaso vacio
		for (int i = 0; i < 100; i++) {
			maquina.servirCafe();
		}
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
	}

}
