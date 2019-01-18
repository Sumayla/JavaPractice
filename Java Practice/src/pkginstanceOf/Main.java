package pkginstanceOf;

public class Main {

	public static void main(String[] args) {
		
		/*Person person = new Employee("Adnan","Parvez",10000);
		Person person1 = new Student("Adnan","Parvez");
		
		person.getDescription();
		person1.getDescription();*/
		
		
		Person[] people = new Person[4];///null,null,null,null
		people[0]= new Employee("Adnan", "Parvez", 1000000);
		people[1]= new Student("sumayla", "khan");
		
		//people[0].getDescription();
		//people[1].getDescription();
				
				//this is an example of ploymorphism ,one funtion getdesc gives diffrent results
			
				///we can use instance of keyword here and run a loop
				
			
		
		for(int i =0; i<people.length; i++)
		{
			if (people[i] instanceof Person)
				people[i].getDescription();
			/*else 
				System.out.println("lala");
		continue;
		break;*/
		
			
		}
		
				
		
	}

}


abstract class Person{
	
	Person(){
		
		
	}
	
	
	
	Person(String name,String surname){
		
		this.name= name;
		this.surname= surname;
		
		
	}
	
	abstract void getDescription();
	
	

	String name;
	String surname;
	
	
	
}

class Employee extends  Person{
	
	public Employee(String name,String surname,double salary){
		
		super(name,surname);
		this.salary=salary;
		
		
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
 class Student extends  Person{

	 
	 
	 public Student(String name,String surname){
		 
		 super(name,surname);
		 
		 
		 
		 
	 }
	@Override
	void getDescription() {
		
		System.out.println("I am a student");
		System.out.println("Name:" + name);
		System.out.println("Surname:" + surname);
		
		
	}
	
	
	
	
}