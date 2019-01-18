package iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		
		ListIterator iterator = list.listIterator();
		
		System.out.println("Traversing in forward direction:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
			
		}

		
		System.out.println("Traversing in reverse direction:");
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous()+" ");
			
		}
	}

}
