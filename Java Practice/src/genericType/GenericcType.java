package genericType;

import java.util.ArrayList;

public class GenericcType {

	public static void main(String[] args) {
		
		 ///raw type,typical type
		//sometimes we want to make a tyoe generic,it means the type is gonna be generic,it will change according to you want 
		//according to the situation,it will be like a parameter or placeholder for the type
		

		String name = "Adnan";
		String name1= "Sumayla";
		
		
		ArrayList n = new ArrayList();
		n.add(name1);
		n.add(name);
		n.add(new Object());
		
		
		String firstname= (String) n.get(2);//it would com[pile but would thrown an exception at runtime
		//so we use generic type
		
		ArrayList<String> n1 = new ArrayList<>();
		
		n1.add(name1);
		n1.add(name);
		//n1.add(new Object());//it wont work since string is the type,its not generic
		//you can only send string here
		//and now you dont need to downcast it like above example
		
		String lastname= n1.get(0);
		
		
		//NOW USE GENERIC TYPE
		
		Box1<String> box = new Box1<>();
		box.setvalue("khan");
		System.out.println(box.nameofvariable);
		
		Box1<Employee1> boxx = new Box1<>();
		boxx.setvalue(null);
		
		
		
		
		//now you can use employee as well
		
		
		
	}

}


class Employee1
{
	
}

//lets work on generic type now,type is whatever you want 

class Box1<Whateveryouwant>{
	
	Whateveryouwant nameofvariable;
	
	
	//create a setter
	
	void setvalue(Whateveryouwant valueofvariable) {
		this.nameofvariable=valueofvariable;
		
		
	}
	
	//create a getter method
	
	Whateveryouwant getvalue() {
		return this.nameofvariable;
		
		
	}
}

//an even better version in another class
