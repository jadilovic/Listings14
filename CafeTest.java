package Code;


import static org.junit.Assert.*;
import org.junit.Test;


public class CafeTest {

	@Test
	public void canBrewCafe(){
		Cafe kaf = new Cafe();
		
		kaf.restockBeans(7);
		
		Coffee vrstaKafe = kaf.brew(CoffeeType.Espresso);
		
		// vrsta kafe
		// ima li dovoljno kafe
		// 
		assertEquals(CoffeeType.Espresso, vrstaKafe.getType());
		assertEquals(0, vrstaKafe.getMilk());
		assertEquals(7, vrstaKafe.getBeans());
	}
}
