package com.capgemini.file.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MyClassSerialization {

	public boolean writeObjectInFile(String string, List<MyClass> myList) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(string);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(myList);
		outputStream.close();

		File file = new File(string);
		
		return file.exists();
		
	}

}
