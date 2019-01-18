package scannerClass;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

	}
	
	public int[] getSumOfEvensAndOdds(int[] input) {
		// Student code begins here
		int x[] = new int[2];
		 int sumO=0;
		 int sumE=0;
		 
		 for(int i = 0; i < input.length; i++)

	        {

	            if(input[i] % 2 == 0)

	            {

	                sumE = sumE + input[i];

	            }

	            else

	            {

	                sumO = sumO + input[i];

	            }

	        }
	        x[0]=sumE;
	        x[1]=sumO;
	        

		
		return x;
		
		// Student code ends here
	}

}

