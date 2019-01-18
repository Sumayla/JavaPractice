package javaBasics;


public class Static {
	int a;
	
	void sample() {
		this.a=5;
		
			
	}

	public static void main(String[] args) {
		// static exists always
		//no need to create an object refernce to acces the static method
		//static means it exists always but it also means it cant access something which is not in its method or class
		//int a cant be accessed by a static method
		//in this case you have to use static content
		
		 Static sumayla= new Static();
	        sumayla.sample();
		
		
		double result =Maths.add(33,44);
				System.out.println(result);
				
				 Customer[] p = new Customer[3];
			        
			        p[0] = new Customer("Sumayla");
			        p[1] = new Customer("Adnan");
			        p[2] = new Customer("Karol");
			  
			        System.out.println(p[0].id);
			        System.out.println(p[1].id);
			        System.out.println(p[2].id);
			       
			        System.out.println(Customer.nextId);

	}

}

class Maths{
	
	static double add(double a,double b) {
		return a+b;
		
	}
}

class Customer{ 
	
	
	Customer(String Name){
		this.Name= Name;
		id= nextId;
		nextId++;
		
		
	}
	int id =0;
	String Name;
	static int nextId =1;

	
	
}
