package stringStringBuilderStringBuffer;

public class StringBuilderToString {

	public static void main(String[] args) {
		
		
		StringBuilder SB = new StringBuilder("Adnan");
		String S= SB.toString();
		SB.append("Parvez");
		
		System.out.println(S);
		System.out.println(SB);
		
		//SAME For string buffer
		
		
		/*
		 * From StringBuffer and StringBuilder to String : This conversions can be perform using toString()
		 *  method which is overridden in both StringBuffer and StringBuilder classes.
Below is the java program to demonstrate the same. Note that while we use toString() method, a new String 
object(in Heap area) is allocated and initialized to character sequence currently represented by 
StringBuffer object, that means
 the subsequent changes to the StringBuffer object do not affect the contents of the String object.
		 */
		
	}

}
