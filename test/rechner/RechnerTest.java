package rechner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {
	@Test
	void testadd() {
		Rechner rechnen = new Rechner();
		assertEquals(2,rechnen.addNumb(1.5,0.5));
	}
	@Test
	void testmult() {
		Rechner rechnen = new Rechner();
		assertEquals(1,rechnen.mulNumb(2,0.5));
	}
	@Test
	void testsub() {
		Rechner rechnen = new Rechner();
		assertEquals(1.5,rechnen.subNumb(2,0.5));
	}
}
