package fileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

	
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("input.txt");
			  int ch;
	            while ((ch = fr.read()) != -1) {
	                System.out.print((char) ch);
	            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
