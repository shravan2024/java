package files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            // Create FileInputStream and wrap it with BufferedInputStream
            FileInputStream fis = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Read bytes from BufferedInputStream
            StringBuilder content = new StringBuilder();
            int data;
            while ((data = bis.read()) != -1) {
                content.append((char) data);
            }

            // Close BufferedInputStream
            bis.close();

            System.out.println("Data read from " + filename + ":");
            System.out.println(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
