package scannerClass;

import java.util.Scanner;

public class DigitOrdering1 {
	

	public static void main(String[] args) {
DigitOrdering1.orderDigits(3927);
		
	
		

	}
	
	static int orderDigits(int input) 
    { 
     
		
		int count=0;
		int remainder = 0;
		int rem=0;
		
		int temp=input;
		
		
		while( temp > 0 ) {
			rem = temp % 10;
			temp = temp/10; // 345 34 3 0
			//System.out.println(num);
			count++;
		
		 
    }
		//System.out.println(count);
		
		int[] array = new int[count];
		int i=0;
		while(input>0)
		{
			remainder=input%10;
			array[i]= remainder;
			input=input/10;
			//System.out.println(array[i]);
			i++;
			
			
		}
		
		return array[i];
		
		
    }
}