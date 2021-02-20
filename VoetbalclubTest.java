package practicum2b;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VoetbalclubTest {
	
	private Voetbalclub v;
	
	@BeforeEach
	public void init() {
		 v = new Voetbalclub("Ajax");
	}

	@Test
	void testNaamNietLeeg() {
		String naam  = v.getNaam();
		assertNotEquals("", naam );
	}
	
	
	@Test
	void testNaamNietNull() {
		String naam  = v.getNaam();
		assertNotEquals(null, naam, "naam is null");
	}
	
	@Test
	void testWVGResultaat() {
		v.verwerkResultaat('w');
		v.verwerkResultaat('w');
		v.verwerkResultaat('w');
		v.verwerkResultaat('g');
		v.verwerkResultaat('v');
		
		assertEquals(10, v.aantalPunten());
	}
	
	@Test
	void testGelijk() {
		v.verwerkResultaat('g');
		assertEquals(1, v.getAantalGelijk());
	}
	
	@Test
	void testVerloren() {
		assertEquals(0, v.getAantalVerloren());
	}
	
	@Test
	void toStrinTest() {
		 v.verwerkResultaat('w');
		 v.verwerkResultaat('v');
		 v.verwerkResultaat('w');
		 v.verwerkResultaat('w');
		 v.verwerkResultaat('g');
		
		 assertEquals("Ajax 11 9 1 1 10", v.toString());
	}
	
	
	


}
