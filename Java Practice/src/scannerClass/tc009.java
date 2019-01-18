package scannerClass;

public class tc009 {
	//Function
	public int getMaxDays(int month, int year) {
		
              int days=0;
              if(month<1 || month>12)
              {
            	  days=-1;
              }
        
              else if(year<1)
              {
            	  days=-2;
              }
              else {
            	  boolean isleapyear =((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
            	  switch(month) {
            	  case 1:
            	  case 3:
          
            	  case 5:
            	 
            	  case 7:
            	  
            	  case 8:
            	  case 10:
            	  case 12:
            		days=31;
            		break;
            	  case 4:
            	  case 6:
          
            	  case 9:
            	 
            	  case 11:
            	  days=30;
            	  break;
            	  
            	  case 2:
            		  if(isleapyear)
            		  {
            			  days=29;
            		  }
            		  else
            		  {
            			  days=28;
            			  
            		  }
            		  
            		  
            	 
            	  
            		  
            	  }
              }
			return 0;
		// Student code ends here
	}

	public void printMaxDays(int month, int year) {
		System.out.print(getMaxDays(month, year));
	}

	 public static boolean isleap(int year){
		return true;
	    }


	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			tc009 obj = new tc009();
			obj.printMaxDays(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		

	}
}
