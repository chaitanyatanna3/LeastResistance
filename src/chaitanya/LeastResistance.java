package chaitanya;

public class LeastResistance {
	
	int [][] matrix = {
			{3, 4, 1, 2, 8, 6},
			{6, 1, 8, 2, 7, 4},
			{5, 9, 3, 9, 9, 5},
			{8, 4, 1, 3, 2, 6},
			{3, 7, 2, 8, 6, 4}
	};
	
	public static int BEST_CASE = 50;
	static int ROW, COLUMN;
	
	public static String output = "No";
	public static String BEST_PATH = "";
	
	public LeastResistance() {
		ROW = matrix.length;
		COLUMN = matrix[0].length;
	}
	
	public void start() {
		for(int i = 0; i < matrix.length; i++) {
			navigate(i, 0, new Tracker());
		}
	}
	
	private void navigate(int row, int column, Tracker tracker) {
		int value = matrix[row][column];
		value = tracker.total + value;
		if (value > BEST_CASE) {		
			return;
		}
	
		tracker.path = tracker.path + " " + row;
		tracker.total = value;
		
		if (column == (COLUMN - 1)) {
			BEST_CASE = tracker.total;
			BEST_PATH = tracker.path;
			output = "Yes";
			return;
		}
		
		column = column + 1;
		if (row == 0) {
			navigate(ROW - 1, column, copyTracker(tracker));
			navigate(row, column, copyTracker(tracker));
			navigate(row + 1, column, copyTracker(tracker));
		} else if (row == ROW - 1) {
			navigate(row - 1, column, copyTracker(tracker));
			navigate(row, column, copyTracker(tracker));
			navigate(0,  column, copyTracker(tracker));
		} else {
			navigate(row - 1, column, copyTracker(tracker));
			navigate(row, column, copyTracker(tracker));
			navigate(row + 1, column, copyTracker(tracker));
		}
	}
	
	
	public static Tracker copyTracker(Tracker t) {
		Tracker copyTracker = new Tracker();
		copyTracker.path = t.path;
		copyTracker.total = t.total;
		return copyTracker;
		
	}
	public static void main(String[] args) {
		LeastResistance leastResistance = new LeastResistance();
		leastResistance.start();
		System.out.println(leastResistance.output);
		System.out.println(leastResistance.BEST_CASE);
		System.out.println(leastResistance.BEST_PATH);
	}

}
