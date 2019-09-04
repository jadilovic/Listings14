package Code;


import static org.junit.Assert.*;
import org.junit.Test;


public class CafeTest {
	
	private static final CoffeeType Espresso = CoffeeType.Espresso;
	private static final int NO_MILK = 0;
	private static final int ESPRESSO_BEANS = Espresso.getRequiredBeans();
	private static final int NO_BEANS = 0;
	private static final CoffeeType Latte = CoffeeType.Latte;
	private static final int LATTE_MILK = Latte.getRequiredMilk();
	private static final int LATTE_BEANS = Latte.getRequiredBeans();
	

	private Cafe cafeWithBeans(){
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		return cafe;
	}

	@Test
	public void canBrewEspresso(){
		
		// given
		Cafe kaf = cafeWithBeans();
		
		// when
		Coffee vrstaKafe = kaf.brew(Espresso);

		// then
		assertEquals("Wrong number of beans", ESPRESSO_BEANS, vrstaKafe.getBeans());
		assertEquals("Wrong type of coffee", Espresso, vrstaKafe.getType());
		assertEquals("Wrong amount of milk", NO_MILK, vrstaKafe.getMilk());
	}
	
	@Test
	public void brewingEspressoConsumesBeans(){
		// given
		Cafe kaf = cafeWithBeans();
		
		// when
		Coffee vrstaKafe = kaf.brew(Espresso);

		// then
		assertEquals(NO_BEANS, kaf.getBeansInStock());
	}
	
	@Test(expected = IllegalStateException.class)
	public void lattesRequiresMilk(){
		// given
		Cafe kaf = cafeWithBeans();
		
		// when
		kaf.brew(Latte);
	}
	
	@Test
	public void canBrewLatte(){
		
		// given
		Cafe kaf = cafeWithBeans();
		kaf.restockMilk(LATTE_MILK);
		
		// when
		Coffee latte = kaf.brew(CoffeeType.Latte);
		
		// then
		assertEquals(CoffeeType.Latte, latte.getType());
		assertEquals(LATTE_MILK, latte.getMilk());
		assertEquals(LATTE_BEANS, latte.getBeans());
	}
	
	// then
	@Test(expected = IllegalArgumentException.class)
	public void mustRestockBeans(){
		// given
		Cafe kaf = cafeWithBeans();
		
		// when
		kaf.restockBeans(NO_BEANS);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void mustRestockMilk(){
		// given
		Cafe kaf = cafeWithBeans();
		
		// when
		kaf.restockMilk(NO_MILK);
	}
}
