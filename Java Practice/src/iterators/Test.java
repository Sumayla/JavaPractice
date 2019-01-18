package iterators;

import java.util.ArrayList; 
import java.util.Iterator; 

public class Test{

	public static void main(String[] args) {
		//Iterator is a public interface that belongs to the collection framework.it allows
		//to traverse the collection,access the data elements ,remove the data element of
		//the collection,has three methods hasnext,object next,void remove()
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		
		 Iterator iterator = list.iterator(); 
		 
		 while(iterator.hasNext())
		 {
			 System.out.print(iterator.next()+ "");
			 
		 }
		
		
		

	}

}
