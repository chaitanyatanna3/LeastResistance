package chaitanya;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestCase {

	@Test
	public void testBestCase() {
		LeastResistance leastResistance = new LeastResistance();
		int best_case = leastResistance.BEST_CASE;
		if (best_case < 0 && best_case > leastResistance.BEST_CASE) {
			assertEquals(best_case, best_case);
		} else {
			assertEquals(50, best_case);
		}
	}

}
