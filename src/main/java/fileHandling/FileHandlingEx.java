package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/New folder/New Text Document.txt");
		f.createNewFile();
		System.out.println("File created Successfully");
//f.deleteOnExit();
		FileWriter fileWriter = new FileWriter(f);
		fileWriter.write("Welcome");
		fileWriter.close();
		System.out.println(f.length());
		System.out.println(f.exists());
		System.out.println(f.getName());
		
		FileReader fileReader = new FileReader(f);
		for (int i = 0; i < f.length(); i++) {
		fileReader.read();
		}
	}
}
