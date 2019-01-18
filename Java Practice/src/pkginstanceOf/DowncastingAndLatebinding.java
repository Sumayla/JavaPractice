package pkginstanceOf;

public class DowncastingAndLatebinding {

	public static void main(String[] args) {
		
		
		Person1[] people = new Person1[4];///null,null,null,null
		people[0]= new Employee1("Adnan", "Parvez", 1000000);
		people[1]= new Student1("sumayla", "khan");
		
		
		for(int i =0; i<people.length; i++)
		{
			if (people[i] instanceof Person1)
				((Employee1)people[i]).work();
			//break;
			

			
			//you can not access method work since its present in employee class,so to access it you have to downcast person1 first
		
			//you get the error in this code since for employee instance it ran but for student instance it got an error
			//so how come the compiler did not check there is something wrong with the code coz the compiler blieves you what you doing,i mean using the right class
			//so it checks the conditions after running it,this is called late binding
			
		}
		
			
	}

}

abstract class Person1{
	
	Person1(){
		
		
	}
	
	
	
	Person1(String name,String surname){
		
		this.name= name;
		this.surname= surname;
		
		
	}
	
	abstract void getDescription();
	
	

	String name;
	String surname;
	
	
	
}

class Employee1 extends  Person1{
	
	public Employee1(String name,String surname,double salary){
		
		super(name,surname);
		this.salary=salary;
		
		
	}
	
	
	void work() {
		System.out.println("I am working");
	}
	
	@Override
	void getDescription() {
		
		System.out.println("I am an employee");
		System.out.println("Name:" + name);
		System.out.println("Surname:" + surname);
		System.out.println("Salary :" +salary);
		
	}
	
	
	double salary;
	
}
 class Student1 extends  Person1{

	 
	 
	 public Student1(String name,String surname){
		 
		 super(name,surname);
		 
		 
		 
		 
	 }
	@Override
	void getDescription() {
		
		System.out.println("I am a student");
		System.out.println("Name:" + name);
		System.out.println("Surname:" + surname);
		
		
	}
	
	
	
	
}
