package iterators;

import java.util.Iterator;
import java.util.LinkedList;



public class IteratorVSForEachLoop {

	public static void main(String[] args) {
		 LinkedList<Integer> l = new LinkedList<Integer>(); 
		  
	        // Now add elements to the Link List 
	        l.add(2); 
	        l.add(3); 
	        l.add(4); 
	        
		  LinkedList<Integer> s=new LinkedList<Integer>(); 
	        s.add(7); 
	        s.add(8); 
	        s.add(9); 
	        
	        
	        for (Iterator<Integer> itr1=l.iterator(); itr1.hasNext(); ) 
	        { 
	            for (Iterator<Integer> itr2=s.iterator(); itr2.hasNext(); ) 
	            { 
	                if (itr1.next() < itr2.next()) 
	                { 
	                    System.out.println(itr1.next()); 
	                } 
	            } 
	        } 
	    } 

	}


/*
 * In the above code we are calling the next() method again and again for itr1 (i.e., for List l).
 *  Now we are advancing the iterator without even checking if it has any more elements left in the c
 *  ollection(in the inner loop), thus we are advancing the iterator more than the number of elements 
 *  in the collection which leads to NoSuchElementException.

for-each loops are tailor made for nested loops. 
 */

