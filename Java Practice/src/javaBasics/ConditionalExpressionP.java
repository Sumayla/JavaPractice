package javaBasics;

public class ConditionalExpressionP {

	public static void main(String[] args) {
		 
		int a= 22;
		
		/*if (a%2==0)
			System.out.println("a is even");
		else 
	        System.out.println("a is odd");
		
*/
		
		String iseven = a%2 ==0 ?"even":"odd" ;
		System.out.println(iseven);
		
	}

}
