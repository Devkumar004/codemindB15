package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.DocFlavor.URL;

public class CompileTimeException {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
		File file = new File("c:/text.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		
	Class.forName(null);
	URL url = new URL("www.google.com");
	}
}
