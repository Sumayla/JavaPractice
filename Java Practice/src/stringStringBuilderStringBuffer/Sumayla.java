package stringStringBuilderStringBuffer;

public class Sumayla{
	
	public static void concatString(String S1) {
		S1= S1+ "Sumayla";
		
				
	}
	
	public static void concatStringBuilder(StringBuilder S2) {
		S2.append("Sumayla");
		
	}

	
	public static void concatStringBuffer(StringBuffer S3) {
		S3.append("Sumayla");
		
	}
	
	public static void main(String[] args) {
		
		//String S1= new String("Adnan");
		String S1= "Adnan";
		concatString(S1); // s1 is not changed 
		System.out.println(S1);
		
		StringBuilder S2 = new StringBuilder("Adnan");
		concatStringBuilder(S2); // s2 is changed 
		System.out.println(S2);
		
		StringBuffer S3 = new StringBuffer("Adnan");
		concatStringBuffer(S3); // s3 is changed 
		System.out.println(S3);
		
		

	}

}
