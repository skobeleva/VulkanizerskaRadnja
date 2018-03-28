/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.ServantRetentionPolicyValue;

import gume.AutoGuma;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Andjelija
 *
 */
public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja vr;
	AutoGuma ag1;
	AutoGuma ag2;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vr=new VulkanizerskaRadnja();
		ag1=new AutoGuma();
		ag1.setMarkaModel("Tigar");
		ag1.setPrecnik(15);
		ag1.setSirina(250);
		ag1.setVisina(70);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vr=null;
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumu() {
		vr.dodajGumu(ag1);
		assertEquals(ag1, vr.gume.getFirst());
	}
	@Test (expected=java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);}
	@Test (expected=java.lang.RuntimeException.class)
	public void testDodajGumuPostoji() {
		vr.dodajGumu(ag1);
		vr.dodajGumu(ag1);
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		
			vr.dodajGumu(ag1);
			assertEquals(vr.pronadjiGumu("Tigar").get(0), ag1 );
		}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, vr.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumuNema() {
		assertEquals(null, vr.pronadjiGumu("Tigarrr"));
	}
	@Test
	public void testPronadjiGumuRazlicitihDimenzija() {
		vr.gume.add(ag1);
		
		ag2=new AutoGuma();
		ag2.setMarkaModel("Tigar");
		ag2.setPrecnik(18);
		ag2.setSirina(205);
		ag2.setVisina(45);
		vr.gume.add(ag2);
		
		assertEquals(ag1, vr.pronadjiGumu("Tigar").get(0));
		assertEquals(ag2, vr.pronadjiGumu("Tigar").get(1));
}
	}


