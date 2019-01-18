package stringStringBuilderStringBuffer;

public class StringtoStringBuilder {

	public static void main(String[] args) {
		
		
		//We can directly pass String class object to StringBuffer and StringBuilder class constructors.
		//As String class is immutable in java, so for editing a string, we can perform same by converting it to 
		//StringBuffer or StringBuilder class objects. 
		
		String S = "Adnan";
		StringBuilder SB = new StringBuilder(S);
		SB.append("Sumayla");
		System.out.println(SB);
		
		StringBuffer sb = new StringBuffer(S);
		sb.reverse();
		System.out.println(sb);
				
	}
	

}
