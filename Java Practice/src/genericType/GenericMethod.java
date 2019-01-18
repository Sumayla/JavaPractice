package genericType;


public class GenericMethod {
	
	public static int countItemOccurances(String[] s,String itemToCount) {
		
		int count=0;
		for(String item:s)
		{
			if(item.equals(itemToCount));
			count++;
			
		}
				
		return count;
		//this method will work for strings
		
		
	}
	
	//now when you wanna count the occurances of all the types of array elements then use generic method
public static <T> int countItemOccurances(T[] s,T itemToCount) {
		
		int count1=0;
		for(T item:s)
		{
			if(item.equals(itemToCount));
			count1++;
			
		}
				
		return count1;
		//this method will work for strings
		
}
	

	//generic method allows you to make the type that is generic between the curly braces of the method
	public static void main(String[] args) {
		
		String[] s = new String[3];
		s[0] = "sumayla";
		s[1] = "sumayla";
		
		int countString=countItemOccurances(s,"sumayla");
		
		int[] i = new int[3];
		i[0]=45;
		i[1]=49;
		
		
		Color[] c = new Color[4];
		c[0] = new Color("red");
        c[1] = new Color("green");
        c[2] = new Color("red");
        c[3] = new Color("red");
		

	}

}


class Color{
	
	String color;
	
	Color(String color) {
		this.color=color;
		
	}
	
	String getColor() {
		return this.color;
		
	}


	
	
	@Override
    public boolean equals(Object o) {
        return (((Color)o).color).equals(this.color);
    }
    
		
		
	}

