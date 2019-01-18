package whatareinterfaces;

import java.util.Arrays;
import java.util.Collections;

public class SortingObjects {

	public static void main(String[] args) {
		
		
		
		
		/*int [] a = new int[3];
				a[0]= 22;
				a[1]= -2;
				a[2]= 29;
				
		
		Arrays.sort(a);
		System.out.println(a[0]);*/
		
		
		Programmer[] p = new Programmer[3];
		
		p[0]= new Programmer(900);
		p[1]= new Programmer(500);
		p[2]= new Programmer(8000);
		
		Arrays.sort(p);//sort method is not gonna work without implemetation of comparable interface
		System.out.println(p[0]);
		System.out.println(p[0].compareTo(p[1]));
		
		Arrays.sort(p);
		//System.out.println(p[0].compareTo(p[1]));
		
		
		  for (Programmer programmer: p)
	        {
	            System.out.println(programmer.getSalary());
	        }
	        

		  Arrays.sort(p, Collections.reverseOrder());

	        for (Programmer programmer: p)
	        {
	            System.out.println(programmer.getSalary());
	        }        
	        
	        
}
}


interface nameOfInterface1{
	
	double PI= 3.14;///public ,final,static
			
			void sample() ;//abstract ,public
				
				
	
}

interface someOtherInterface1{
	
	
}

class Employee1 implements Comparable{

	
	

	Employee1(double salary){
		
		this.salary= salary;
		
		
	}
	double getSalary(){
		
		return salary;
		
	}
	
	private double salary;

	@Override
	public int compareTo(Object t) {
		
		 Employee1 tmp= ((Employee1)t);
		 
		
		if (this.salary< tmp.getSalary())
			return -1;
		
		if (this.salary> tmp.getSalary())
			return 1;
		
		return 0;
		
	}
	
}


class Programmer extends Employee1{

	Programmer(double salary) {
		super(salary);
		
	}
	
	
}


