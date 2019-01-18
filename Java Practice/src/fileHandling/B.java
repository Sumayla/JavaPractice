package fileHandling;

import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {
		WriteDataIntoTextFile obj = new WriteDataIntoTextFile();
		obj.writingData("C:\\Users\\SumaylaKhan\\Desktop\\Testdata" , "WriteData.txt", "Sumayla believes");
	}

}
