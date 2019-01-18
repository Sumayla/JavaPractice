package reference;

public class Reference {

	public static void main(String[] args) {
		
		//primitive variable
		int x= 30;//(here we are assigning values)
	
		int y=x;//its actaully creating a copy of x
		
	 y =10;
	 
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		//refernce variable here we are assigning an address coz it refers to a place in the memory and we are going to use ot through varaible test 
		Test test = new Test();
		Test test1= test;
		
		test1.a=60;
		
		
		System.out.println(test.a);
		
		
		String name = "Adnan";
		String name2 = new String(name);
		
		name2 = name;
		System.out.println(name);
		
		//strings are almost like primitive types
		
		
		
				
	}

}

class Test{
	
	int a;
	
	
}
