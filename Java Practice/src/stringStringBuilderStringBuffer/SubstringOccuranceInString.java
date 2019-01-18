package stringStringBuilderStringBuffer;

public class SubstringOccuranceInString {

	public static void main(String[] args) {
String str = "SupermanAntmanSpiderman";



        //using index of method
        String strFind = "man";
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
 
            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }
        
        System.out.println("Total occurrences: " + count);
        
        
        //using split method
        
       String[] s= str.split("man", -1);
       System.out.println(s[0]);
       System.out.println(s[1]);
       System.out.println(s[2]);
       System.out.println(s[3]);
       
       int count1 =((s.length)-1);
       System.out.println(count1);
    }
}
