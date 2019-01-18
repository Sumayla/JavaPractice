package javaBasics;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {
		
		int[] array = {12,23,22,34,67,75};
		//sorting an array
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		//sorting subarray of an array
		
		int[] array1= {11,45,76,44,33,22,46,78};
		
		Arrays.sort(array1, 2, 4);
		System.out.println(Arrays.toString(array1));
		
		/*
		 * from_Index - the index of the first element, inclusive, to be sorted
       to_Index - the index of the last element, exclusive, to be sorted

		 */

		
		// Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't// work for primitive types. 
		//int is a primitive data type while Integer is a Wrapper class. 
		
		Integer[] array2= {45,67,89,23,90,22,34};
		Arrays.sort(array2,Collections.reverseOrder());
		
//Collection is a root level interface of the Java Collection Framework.
		//... Collection interface is a member of java.util package. Collections is an utility class in java.util package. It consists of only static methods which are used to operate on objects of type Collection.
		
		System.out.println(Arrays.toString(array2));
		
		
		//sorting arrays based on alphabetical order
		
		String[] array3 = {"sumayla","adnan","khan","parvez"};
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3));
	}

}
