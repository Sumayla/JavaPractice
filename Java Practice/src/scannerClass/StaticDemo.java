package scannerClass;

import java.util.Scanner;

class Static {
	

    
	public static double fahrenheitToCelcius(double frnht) {
		 double celsius = (frnht - 32)*5/9;
	        return celsius;
		
		
	}
	
	static int max(int A,int B) {

        int result = Math.max(A, B);
        return result;
        
  	
	}

}


public class StaticDemo {
	 	public static void main(String args[]) {
	 		
	 		
	 	    Scanner input = new Scanner(System.in);

			
	       
	 	    
	 	    int option=input.nextInt();
	 	    
	 	    
	 	   switch(option)
	 	  {
	 	   case 1:
	 	   {
	 		   
	 		  double frnht1 = input.nextDouble();
	 
	 	          
	 	          System.out.println(Static.fahrenheitToCelcius(frnht1));
	 	          break;
	 	    } 
	 	   case 2:
	 	    {
	 	    	
	 	    	int a= input.nextInt();
		       int b=input.nextInt();
		        
		        System.out.println(Static.max(a,b));
		        break;
		       
	 	    
	 	    }
	 	    case 3:
	 	    	{
	 	    	 System.out.println("Invalid Option");
	 	    	 break;
	 	    	}
	 	  }
	 	  
	 	   

	 	}
}