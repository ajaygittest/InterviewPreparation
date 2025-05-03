package fileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream os = new FileOutputStream("os.png");
			
			String text ="Output Stream Project";
			os.write(text.getBytes());
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
