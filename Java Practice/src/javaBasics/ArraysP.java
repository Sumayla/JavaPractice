package javaBasics;

public class ArraysP {
	
	
	public static void main(String[] args) {
	int[] array = new int[4] ;
	
	array[0]= 4;
	array[1]=3;
	array[2]=78;
	
	System.out.println(array[0]);
	//System.out.println(array[4]);//will throw error since this has not been initialized so how can it return something which doesnot exist.
	
	
	//another way of initialization is
	
	int[] array2 = {3,56,74,78};
	
	System.out.println(array2.length);
	
	//index starts from 0 but the length wud be the actual number of elements in array
	
	//display the last element of the array
	
	System.out.println(array2[array2.length-1]);
	

}

}


///int[] array = new int[4]
///int [][] tab = new int[3][3]