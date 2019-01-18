package javaBasics;

public class MethodOverloadingP {

	public static void main(String[] args) {
		// Same method name but diffrent arguements and the return type can be diffrent
		//the compiler know which one to choose because of the args
		//println is an example of overloaded method
		
		
		Math math = new Math();
		double result =math.add(10.01, 50.99);
		System.out.println(result);
		
		int result1= math.add(4, 8);
		System.out.println(result1);
		
	}

}

class Math{
	
	int add(int x,int y) {
		return x+y;
			
	}
	
	
	double add(double x,double y) {
		return x+y;
		
	}
}