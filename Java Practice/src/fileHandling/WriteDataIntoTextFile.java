package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	
	public void writingData(String filepath,String filename, String data) throws IOException {
		
		File f = new File(filepath +"\\"+ filename);
		FileWriter fw = new FileWriter(f);
		//FileWriter fw = new FileWriter(f,true);
		//if you want to work in append mode then use this second arg as true
		
		
		
		
		 /*fw.write(data);
		fw.flush();
		fw.close();
		*/
		
		//whenever we are going to save this it will save one char at a time,so slow proceess
		//bw is a wrapper over fw
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
		
		
	}

}
