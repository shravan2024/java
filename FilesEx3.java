package files;

import java.io.*;
public class FilesEx3 {

	public static void main(String[] args) throws IOException {
		
		/*File f=new File("E://FJWP");
		File f1[]=f.listFiles();
		for(File f3:f1)
		{
			System.out.println(f3.getName()+" "+f3.canWrite()+" "+f3.length());
		}*/
		File file=new File("E://FJWP/files/Abc.txt");
		/*if(file.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("Already exists");
		}*/
		System.out.println(file.exists());
	}

}
