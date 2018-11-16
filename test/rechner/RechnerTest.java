package rechner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {
	@Test
	void test() {
		Rechner rechnen = new Rechner();
		assertEquals(23,rechnen.addNumb(16,7));
	}
}
