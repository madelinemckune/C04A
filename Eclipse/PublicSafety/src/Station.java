import java.util.Arrays;

//import Detective;

public class Station {
	public static int badgeNumber =1; 
	public static String stationName;
	public Detective[] employees;
	private final static int MAX_NUM = 5;

	public boolean canHire () {
		if (employees.length < MAX_NUM) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void newHire (String s) {
		Detective d = new Detective ();
		d.name = s;
		d.lastBadgeNum = badgeNumber;
		employees[d.lastBadgeNum-1] = d;
		badgeNumber++;
	}
	
	
	
	public static void main(String[] args) {
	}

}
