package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        String filename = "example.txt";
        String data = "Hello, BufferedOutputStream!";

        try {
            // Create FileOutputStream and wrap it with BufferedOutputStream
            FileOutputStream fos = new FileOutputStream(filename);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // Convert string to bytes and write to BufferedOutputStream
            byte[] bytes = data.getBytes();
            bos.write(bytes);

            // Flush and close BufferedOutputStream
            bos.flush();
            bos.close();

            System.out.println("Data has been written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
