package scannerClass;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingPattern.printPattern(7);

	}

	public static void printPattern(int n) {
		int i, j,k;

		
		for (i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

		
			// ending line after each row
			System.out.println();
		}
		
		
		 for ( i = n-1; i >= 0; i--) {
	            for ( j = 1; j <= i; j++)
	            	System.out.print("* ");
	            System.out.println();
	        }
	        System.out.println();
	}
}
