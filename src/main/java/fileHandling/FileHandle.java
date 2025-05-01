package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileHandle {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/New folder/Sujata.txt");
		f.createNewFile();

		System.out.println("File created successfully");
		// f.delete();

		FileWriter fileWriter = new FileWriter(f);
		fileWriter.write("Hello sujata madam");
		fileWriter.close();
		System.out.println("Data written successfully");

	}
}
