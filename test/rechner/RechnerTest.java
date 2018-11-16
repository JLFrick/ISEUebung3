package rechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechnerTest {

	@Test
	public void testAddNumb() {
		Rechner rechnen = new Rechner();
		assertEquals(2,rechnen.addNumb(1.5,0.5));
	}

	@Test
	public void testSubNumb() {
		Rechner rechnen = new Rechner();
		assertEquals(1.5,rechnen.subNumb(2,0.5));
	}

	@Test
	public void testMulNumb() {
		Rechner rechnen = new Rechner();
		assertEquals(1,rechnen.mulNumb(2,0.5));
	}
}
