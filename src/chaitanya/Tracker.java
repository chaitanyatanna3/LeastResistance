package chaitanya;

public class Tracker {
	
	int total = 0;
	String path = "";
	
	@Override
	public String toString() {
		return path + " : " + total;
	}

}
