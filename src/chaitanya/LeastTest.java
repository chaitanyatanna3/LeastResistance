package chaitanya;

import static org.junit.Assert.*;
import org.junit.Test;

public class LeastTest {

	@Test
	public void testStart() {
		LeastResistance leastResistance = new LeastResistance();
		int length = leastResistance.matrix.length;
		if (length < 1 && length > 100) {
			assertEquals(length, length);
		} else {
			assertEquals(5, length);
		}
		
	}

}
