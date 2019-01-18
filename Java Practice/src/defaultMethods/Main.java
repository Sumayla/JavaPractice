package defaultMethods;

public class Main {

	public static void main(String[] args) {
		
		//you could use the lambda expression only when there is one method inside the interface but since the default method is 
		//not abstractt lamda will work since Lamda will look for the signature method which is abstractt
		
		Formula f =  (int a) -> {
			
		
				return 0;
			
		};
		};
		
		

	}



interface Formula{
	double calculate(int a);//public abstract
	
	
	//you can create a default method
	default double squareRoot(int a) {  // not abstract
		
		return Math.sqrt(a);
		
		
	}
}

class A implements Formula{
	
	//By default this method will have to be overridden ,you can override the default method as well if you need to

	@Override
	public double calculate(int a) {
		
		return 0;
	}
	
}