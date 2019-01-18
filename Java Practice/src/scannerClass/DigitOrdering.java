package scannerClass;

public class DigitOrdering {

	public static void main(String[] args) {
		DigitOrdering  obj = new DigitOrdering ();
		long a =obj.orderDigits(15287);
		System.out.println(a);
	
	
	}
	
	public long orderDigits(long input)
    { 
        boolean flag=input<0;
        long[] count = new long[10]; 
       
       
        	
            long d = input % 10; // extract last digit 
            count[(int) d]++; // increment counting 
            input = input / 10; //remove last digit 
        
        
        
        int result = 0; 
        if (flag=false) {
        for (int i = 0 ; i <= 9 ; i++) 
        { 
            if (count[i] != 0) 
            { 
                result = i; 
                count[i]--; 
                break; 
            } 
        } 
      
        
      
        for (int i = 0 ; i <= 9 ; i++) 
        {
            while (count[i]-- != 0) 
                result = result * 10 + i; 
        }
        
        return result;
    }
        
        
        else if(flag)
        	
        {
        	for (int i = 0 ; i <= 9 ; i++) 
            { 
                if (count[i] != 0) 
                { 
                    result = i; 
                    count[i]--; 
                    break; 
                } 
            }
        	
        	for (int i = 9 ; i >=0 ; i--) 
              {
                  while (count[i]-- != 0) 
                      result = result * 10 + i; 
              }
        	  
        	result = result*-1;
        	
        }
       
     
   
        
        return result; 
     
    
    
	
	 
    
    }	
	
		// Student code ends here
	}

