package runTimeException;

import java.io.File;
import java.io.IOException;

public class PdfCreator {

    public static void main(String[] args) {
        File obj = new File("myfile.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("File Created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
