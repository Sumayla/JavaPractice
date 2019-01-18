package nestedClasses;

public class Main {

	public static void main(String[] args) {
		
		A outer = new A();
		A.B whatever = outer.new B();//we need instance of outer class to create inner class,inner class exists inside outer class
		
		A.C whatever1=new A.C(); //static class c
		
		

	}

}

class A{//OUTER CLASS
	
	A(){
		System.out.println("I am constructor from outer class A");
	}
	
	
	//we cant access sample here even when we make it public
	
	
	class B///NESTED CLASS,INNER CLASS
	{
		B(){
			
			System.out.println("I am constructor from nested class B");
			
		
		}
		
		int x=4;//can access properties from the outer class

		  
		  
		  private double sample;
	
	}
	




  static class C{ //STATIC CLASS/NESTED CLASS
	  
	  static double pi=3.14;
	  //now we can create static variable,static variable exist always even though if you have not created class A
	
	//it exist even when you dont crate the object of class a
	 C(){
		
	System.out.println("I am constructer from staic class C");
	}
	 
	 
	 //Cant access int x here since static class does not need outer class to exist so how can you be sure if this x is present
}
  
  
	private  int x;
	
	



}