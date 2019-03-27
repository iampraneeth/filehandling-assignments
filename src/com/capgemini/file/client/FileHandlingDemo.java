package com.capgemini.file.client;

//import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("C:\\RAM\\BankAccount.java");
		 * System.out.println(file.exists());
		 * 
		 * File folder = new File("C:\\RAM3"); System.out.println(folder.exists());
		 */
		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("file is created successfully"); }
		 */

		// FileWriter writer = new FileWriter(file, true);
		// BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		/*
		 * PrintWriter writer =new PrintWriter(new FileWriter(file,true));
		 * writer.println("Hello"); writer.println("hii"); writer.println("bye");
		 * 
		 * writer.close(); System.out.println("content has been updated");
		 */
		/*
		 * FileReader reader = new FileReader(
		 * "C:\\RAM\\collection-assignments\\src\\com\\capgemini\\main\\Car.java");
		 * BufferedReader bReader = new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter("carfile.java"); String content; while ((content =
		 * bReader.readLine()) != null) { // System.out.println(content);
		 * writer.println(content); } System.out.println("success"); writer.close();
		 * bReader.close(); reader.close();
		 */
		/*
		 * File windowsDirectory=new File("C:\\WINDOWS");
		 * System.out.println(windowsDirectory.isDirectory()); String
		 * content[]=windowsDirectory.list();
		 * 
		 * for(String s:content) { System.out.println(s); }
		 */
		File newDir=new File("mydir");
		if(!(newDir.exists())) {
			newDir.mkdir();
			System.out.println("succesfully created folder");
		}
		File file=new File(newDir,"myfile.txt");
		if(!(file.exists())) {
			file.createNewFile();
			System.out.println("file is created in folder");
		}
	}

}
