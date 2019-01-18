package scannerClass;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int oversBowled=scan.nextInt();
		System.out.println("Overs Bowled:" + oversBowled );
		
		float currentRunRate =scan.nextFloat();
		System.out.println("Current Run Rate:" + currentRunRate );
		
		int targetScore = scan.nextInt();
		System.out.println("Target Score:" + targetScore );
		
		float requiredRunRate = (targetScore -(currentRunRate*oversBowled))/40;
		
		System.out.printf("Require run rate is %.2f", requiredRunRate);
		
		
	}

}
