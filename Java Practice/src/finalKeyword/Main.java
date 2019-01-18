package finalKeyword;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		final double pi;
		pi=3.14;
		
		Employee e = new Employee();
			// e.DateOfEmployment= new Date(); not working
		
		System.out.println(e.DateOfEmployment);
		
		
		
		
		

	}

}


abstract class Person{
	
	
}

class Employee extends Person{//classes as final occur very rarely when u dont wnat someone to extend them
	
	//final Date DateOfEmployment = new Date(); this is one way
	//another way is using the constructor
	
	Employee(){
		
		this.DateOfEmployment= new Date();
		
	}
	
	Employee(Date date){
		
		this.DateOfEmployment= date;
		
				
		
	}
	
	final Date DateOfEmployment;
	
	
	final Date getDateofEmploment() {
		
		return DateOfEmployment;
		
	}
}

class Programmer extends Employee{
	
	//now final method cant be overridden here
	
	
}