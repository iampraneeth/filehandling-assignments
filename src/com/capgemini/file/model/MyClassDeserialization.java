package com.capgemini.file.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MyClassDeserialization {

	public Object readObjectInFile(String string) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(string);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		
		ArrayList<MyClass> student = (ArrayList<MyClass>)inputStream.readObject(); 
		return student;
	
	}

	
}
