package javaBasics;

public class DoWhileLoop {

	public static void main(String[] args) {
		String[] movies = {
				"troy",
				"marvel",
				"Avengers",
				"IronMan"
		};
		
		int i=16;
		
		do{
			System.out.println(movies[i]);
			i++;
		}
		while (i<movies.length);
		
		
	}

}
