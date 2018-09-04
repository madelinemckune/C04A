import java.util.Scanner;

public class PublicSafety {

	public Station one;
	public Station two;
	
	public PublicSafety() {
		super();
	}
	
	public PublicSafety(String x, String y) {
		one.stationName = x;
		two.stationName = y;
	}
	
	public void printDetectiveLists(){
		System.out.println("Printing All Detectives");
		//print current station name
		System.out.println("List of detectives for" + one.stationName);
		for (int i = 0; i <one.employees.length; i++) {
			//print current station badge number
			System.out.println("Detective [Badge="+ one.badgeNumber +", Name=" + one.employees[i] + "]");
		}
		System.out.println("List of detectives for" + two.stationName);
		for (int j = 0; j <two.employees.length; j++) {
			//print current station badge number
			System.out.println("Detective [Badge="+ two.badgeNumber +", Name=" + two.employees[j] + "]");
		}
		
	}

	public void doHire(boolean stationNumber) {
		//check if we can hire
		if (stationNumber) {
			//check if we can hire for station 2
			//if
			if (one.canHire()) {
				System.out.println("New hire for " + two.stationName + "...Enter detective's name: ");
				Scanner scan = new Scanner(System.in);
				String name = scan.nextLine();
			}
			//else
			else {
				System.out.println("Cant' hire any more detectives for " + two.stationName);
			}
		}
		else {
			//check if we can hire station 1
			//if
			if (two.canHire()) {
				System.out.println("New hire for " + one.stationName + "...Enter detective's name: ");
				Scanner scan = new Scanner(System.in);
				String name = scan.nextLine();
			}
			//else
			else {
				System.out.println("Cant' hire any more detectives for " + one.stationName);
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
