package files;

import java.io.*;
public class FilesEx4 {

	public static void main(String[] args) throws IOException {
		String dirname = "E://FJWP1";
	      File directory = new File(dirname);

	      // Create directory now.
	      directory.mkdirs();

	      // create new file object
	      File file = new File("E://FJWP1/in.txt");
	      file.createNewFile();

	      System.out.println(file.exists());      

	}

}