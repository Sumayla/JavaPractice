package javaBasics;

public class SwitchP {

	public static void main(String[] args) {
		
		int a=60;
		
		switch(a){
		case 50:
			System.out.println("a is equal to 50");
		case 60:
			System.out.println("a is equal to 60");
			System.out.println("a is equal to 50");
			break;
		case 80:
			System.out.println("a is equal to 80");
			System.out.println("a is equal to 50");
			default:
				System.out.println("a is equal to whatever");
		}
	}

}
