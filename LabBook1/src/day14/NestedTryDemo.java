package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryDemo {

	public static void main(String[] args) {
		try {
			try {
				FileInputStream fs=new FileInputStream(args[0]);
			}
			
			catch(IOException e) {
				System.out.println("Read Error");
			}
			
			//catch (FileNotFoundException e) {
				//System.out.println("File not found");
				
			//}
			
			
			}
		finally {
			
		}

	}

}
