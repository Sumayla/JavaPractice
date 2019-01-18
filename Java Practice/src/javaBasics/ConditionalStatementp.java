package javaBasics;

public class ConditionalStatementp {

	public static void main(String[] args) {
		
		int a= 3;
		int b = 6;
		int c=20;
		
		if (a>b || c==10)
			System.out.println("a>b || c==10");
		 
		    //executing mmore than one statement by using curly braces
		
		else if (a<c && b>a)
			{System.out.println("true");
             System.out.println("test");  }   
		else  
			System.out.println("sumayla");
	}

}
