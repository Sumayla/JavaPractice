package stringStringBuilderStringBuffer;

public class StringBuilderToStringBuffer {

	public static void main(String[] args) 
    { 
        StringBuffer sbr = new StringBuffer("Geeks"); 
          
        // conversion from StringBuffer object to StringBuilder 
        String str = sbr.toString(); 
        StringBuilder sbl = new StringBuilder(str); 
          
        System.out.println(sbl); 
          
    } 
		
		
		/*
		 *From StringBuffer to StringBuilder or vice-versa : This conversion is tricky.There is no direct way to convert 
		 *the same. In this case, We can use a String class object. We first convert StringBuffer/StringBuilder 
		 *	object to String using toString() method and then from String to 
		 *StringBuilder/StringBuffer using constructors.Below is the java program to demonstrate the same.
		 */

	

}
