/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

/**
 * @author Andjelija Skobelev
 *
 */
public class AutoGumaTest {

	private AutoGuma ag;
	
	@Before
	public void setUp() throws Exception {
		ag= new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		ag=null;
	}

	
	@Test
	public void testSetMarkaModel() {
		
		String markaModel = "Tigar";
		
		ag.setMarkaModel(markaModel);
		
		assertEquals(markaModel, ag.getMarkaModel());
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		
		ag.setMarkaModel(null);
	
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModel3() {
		
		ag.setMarkaModel("ti");
	
	}
	
	@Test
	public void testSetPrecnik() {
		int precnik= 20;
		ag.setPrecnik(precnik);
		assertEquals(precnik,ag.getPrecnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		ag.setPrecnik(11);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVece() {
		ag.setPrecnik(23);
	}
	

	@Test
	public void testSetSirina() {
		int sirina= 200;
		ag.setSirina(sirina);
		assertEquals(sirina, ag.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		ag.setSirina(134);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVece() {
		ag.setSirina(356);
	}
	
	@Test
	public void testSetVisina() {
		int visina= 50;
		ag.setVisina(visina);
		assertEquals(visina, ag.getVisina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		ag.setVisina(20);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVece() {
		ag.setVisina(100);
	}

	
	@Test
	public void testToString() {
		ag.setMarkaModel("Tigar");
		ag.setPrecnik(15);
		ag.setSirina(175);
		ag.setVisina(70);
		assertEquals("AutoGuma [markaModel=Tigar, precnik=15, sirina=175, visina=70]", ag.toString());
	}
	@Test
	public void testEqualsTrue() {
		ag.setMarkaModel("Tigar");
		ag.setPrecnik(15);
		ag.setSirina(175);
		ag.setVisina(70);
		
		AutoGuma ag2=new AutoGuma();
		ag2.setMarkaModel("Tigar");
		ag2.setPrecnik(15);
		ag2.setSirina(175);
		ag2.setVisina(70);
		assertEquals(ag.equals(ag2), true);
	}
	@Test
	public void testEqualsFalse() {
		ag.setMarkaModel("Tigar");
		ag.setPrecnik(15);
		ag.setSirina(175);
		ag.setVisina(70);
		
		AutoGuma ag2=new AutoGuma();
		ag2.setMarkaModel("Tigar");
		ag2.setPrecnik(15);
		ag2.setSirina(195);
		ag2.setVisina(70);
		assertEquals(ag.equals(ag2), false);
	}

	
}
