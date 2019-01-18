package aggregation;

public class Aggregation {

	public static void main(String[] args) {
		// aggregation means connection ,connecting addtional objject inside an another class
		//a specific aggreagation which means this object is nothing without the class,job doenst exist without employee
		
		Employee e = new Employee("Adnan", new Address("Oshiwara", 18, "India"));
		System.out.println(e);

	}

}


class Employee{
	
String name;
Address address;//aggregation
Job job;//composition


 //String address="302 b18 mumbai";
 
 public Employee(String name,
 Address address) {
	
	
	 this.name=name;
	 this.address= address;
	 
}
 
 
 @Override
	public String toString() {
		
		return this.name+ ":" + address.country;
		
	}
}