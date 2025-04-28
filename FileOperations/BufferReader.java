package fileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) {
		   try {
	            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
	            String line;
	            System.out.println((br.readLine()));
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
