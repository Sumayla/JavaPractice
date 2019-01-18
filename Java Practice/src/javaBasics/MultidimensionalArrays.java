package javaBasics;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int[][] cell = new int[3][3];
		
		 /*
        ------------------------------------
           [0][0]   |  [0][1] |   [0][2]   |
        ------------------------------------
        ------------------------------------
           [1][0]   |  [1][1] |   [1][2]   |
        ------------------------------------
        ------------------------------------
           [2][0]   |  [2][1] |   [2][2]   |
        ------------------------------------
      
    */

		
	cell[0][2]=46;
	//cell[1][4]= 78;//will throw an error since column four doesnt exist
	
	System.out.println(cell[0][2]);
	
	
	int[][] tab = {
			{90,11},
			{88,86}
	};
	
	
	System.out.println(tab[1][1]);
	
		
	}

}
