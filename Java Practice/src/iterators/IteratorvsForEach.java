package iterators;

import java.awt.List;
import java.util.LinkedList;

public class IteratorvsForEach {

	public static void main(String[] args) {
		/*
		 * In for-each loop, we can’t modify collection, it will throw a 
		 * ConcurrentModificationException on the other hand with iterator we can modify collection.

Modifying a collection simply means removing an element or changing content of an item stored in the collection.
 This occurs because for-each loop implicitly creates an iterator but it is not exposed 
to the user thus we can’t modify the items in the collections.

When to use which traversal?

    If we have to modify collection, we can use Iterator.
    While using nested for loops it is better to use for-each loop, consider the below code for better understanding.

		 */
		
		
		  LinkedList<Integer> l = new LinkedList<Integer>(); 
		  
	        // Now add elements to the Link List 
	        l.add(2); 
	        l.add(3); 
	        l.add(4); 
	        
		  LinkedList<Integer> s=new LinkedList<Integer>(); 
	        s.add(7); 
	        s.add(8); 
	        s.add(9); 
		
		for(int myvalue1:l)
		{
			for(int myvalue2:s)
			{
				if(myvalue1<myvalue2)
					System.out.println(myvalue1 +" ");
			}
		}
		
	}

}
