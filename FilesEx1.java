package files;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Anudip Foundation\\Filesinput.txt");
		int data = fis.read(); // Read a single byte
		FileOutputStream fos = new FileOutputStream("D:\\Anudip Foundation\\Filesouput.txt");
		while (data!=-1) {
		fos.write(data); // Write a single byte
		data=fis.read();
		}
		fos.close();
		fis.close();
		System.out.println("File copied successfully");
	}

}