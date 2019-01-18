package whatareinterfaces;

public class Main {

	public static void main(String[] args) {
		
		
		nameOfInterface a = new Employee(1000);
		//Object b = new Employee();
		//super class which is highest place in heirarchy can refer to the one that extends it

		
		a.sample();//coz sample is in employee and has the signature in interface
		
		//a.salary; not possible since its in employee
		
		((Employee)a).getSalary();
		System.out.println(((Employee)a).getSalary());
		
	}

}

 interface nameOfInterface{
	
	double PI= 3.14;///public ,final,static
			
			void sample() ;//abstract ,public
				
				
	
}

interface someOtherInterface{
	
	
}

class Employee implements nameOfInterface,someOtherInterface{

	@Override
	public void sample() {
		
		
	}
	
	Employee(double salary){
		
		this.salary= salary;
		
		
	}
	double getSalary(){
		
		return salary;
		
	}
	
	private double salary;
	
	
}
