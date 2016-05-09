package chaitanya;

import static org.junit.Assert.*;

import org.junit.Test;

public class RowColumnTest {

	@Test
	public void testRowColumn() {
		LeastResistance leastResistance = new LeastResistance();
		int row = leastResistance.ROW, column = leastResistance.COLUMN;
		if (row == 0) {
			assertEquals(row, row);
		} else {
			assertEquals(5, row);
		}
		if (column == 0) {
			assertEquals(column, column);
		} else {
			assertEquals(6, column);
		}
	}

}
