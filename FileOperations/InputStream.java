package fileOperations;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream sr = new FileInputStream("os.bin");
		int ch;
		
		while((ch=sr.read()) != -1) {
			System.out.print((char)ch);
		}

	}

}
