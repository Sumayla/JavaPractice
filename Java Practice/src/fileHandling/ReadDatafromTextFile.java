package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromTextFile {

	public static void main(String[] args) {
		
		
		
	}

	
	public void readingFile(String filepath,String filename) throws IOException {
		
		File f = new File("C:\\Users\\SumaylaKhan\\Desktop\\Testdata\\ReadData.txt");
		
		//File f = new File(filepath+ "\\" +filename);
		
		FileReader fr = new FileReader(f);
		//this read method will read only one char at a time plus it reads only ascii value 
		//buffrered reader is a wrapper over file reader
		BufferedReader br = new BufferedReader(fr);
		//br reads complete line and also in string format
		
		
		
	/*int i= fr.read();
	//if we reach the end of the file we get -1 so looping till the end of the file
		while (i!=-1)
		{
			//System.out.println(i);
			System.out.print((char)i);
			i=fr.read();
			
		}*/
		
		//null here is end of file
		String s= br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s= br.readLine();
			
		}
	}
}
