package scannerClass;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5};
		sum.getSumOfEvensAndOdds(array);
		
		

	}

	public static int[] getSumOfEvensAndOdds(int[] input) {
		// Student code begins here
		int x[] = new int[5];
		 int sumO=0;
		 int sumE=0;
		 
		 for(int myvalue:input)

	        {

	            if(myvalue % 2 == 0)

	            {

	                sumE = sumE + myvalue;

	            }

	            else

	            {

	                sumO = sumO + myvalue;

	            }

	        }


	        int[] array1= new int[2];
	        array1[0]= sumE;
	        array1[1]=sumO;
	        
	        
	        System.out.println("Sum of Even Numbers:"+sumE);

	        System.out.println("Sum of Odd Numbers:"+sumO);
		return array1;
		
		// Student code ends here
	}
	
}
