package scannerClass;

public class IntegerDivision {

	public static void main(String[] args) {
	
		if (args.length != 2) {
			System.out.println("2 inputs were not supplied");
			return;
		}
		
		

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			if(num2 ==0)
			{
				System.out.println("Attempted to divide by zero");
				return;
			}
			if(num1!= Integer.parseInt(args[0]))
			{
				System.out.println("A non-integer input was given");
				return;
			}
			IntegerDivision obj = new IntegerDivision();
			obj.division(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");

	}
	}
	
	public void division(int a,int b) {
		
		int result =a/b;
		System.out.println(result);
	}
}
