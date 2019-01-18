package javaBasics;

public class MethodsP {

	public static void main(String[] args) {
		// method is a block of code that can be used anywhere as many time we want
		//println is a method,cool thing is you can call it many times and if somebody wants to improve a method then he will just change it in the method an dit will be reflected at all the places it has been called at

		//methods should be self descriptive
		//the parenthesis invokes the func 
		//the place you invoke a method is gonna be replaced by the return thing 
		
		
		Test test = new Test();
		test.printSomething( "Adnan","Parvez");
		test.printSomething( "Sumayla","Khan");
		
		
		int result= test.addNumbers(40,50);
		System.out.println(result);
		
		double result1 = test.divideNumbers(8, 0);
		System.out.println(result1);
		
		
	}

}


class Test{
	
	
	void printSomething(String name,String surname) {
		//String Name= "Adnan"
	   // String Surname ="Parvez"
	    
	    
				System.out.println("Name:" + name);

				System.out.println("Name:" + surname);
				System.out.println("Name:" + name + " " + surname);
				System.out.println("Print something");
	}
	
	
	int addNumbers(int a,int b) {
		
		//return 5;
		return a+b;
		
		
	}
	
	//I can use the same parameters a and b coz their scope is only withing the curly braces ,it dies outside them
	
	
	double divideNumbers(double a, double b) {
		
		if (b==0)
			return 0;
		
		//instruction below return wont be executed coz when the compiler sees return it jumps to the place where the method was invoked and assigns it to the result
		
		
		System.out.println("su");
		return a/b;
		
		
	}
}

