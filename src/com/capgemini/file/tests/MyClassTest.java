package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemini.file.model.MyClass;
import com.capgemini.file.model.MyClassDeserialization;
import com.capgemini.file.model.MyClassSerialization;

public class MyClassTest {

	private MyClassSerialization myClassSerialization;
	private MyClassDeserialization myClassDeserialization;

	@Test
	public void testMyClassSerialization() throws IOException {
		MyClass myClass1 = new MyClass(101, "John 1", 45);
		MyClass myClass2 = new MyClass(102, "John 2", 55);
		MyClass myClass3 = new MyClass(103, "John 3", 65);
		MyClass myClass4 = new MyClass(104, "John 4", 75);
		MyClass myClass5 = new MyClass(105, "John 5", 85);
		List<MyClass> myList = new ArrayList<>();
		myList.add(myClass1);
		myList.add(myClass2);
		myList.add(myClass3);
		myList.add(myClass4);
		myList.add(myClass5);
		

		myClassSerialization = new MyClassSerialization();
		assertTrue(myClassSerialization.writeObjectInFile("myclass.ser", myList));
	}
	@Test
	public void testMyClassDeserialization() throws ClassNotFoundException, IOException {
		MyClass myClass1 = new MyClass(101, "John 1", 45);
		MyClass myClass2 = new MyClass(102, "John 2", 55);
		MyClass myClass3 = new MyClass(103, "John 3", 65);
		MyClass myClass4 = new MyClass(104, "John 4", 75);
		MyClass myClass5 = new MyClass(105, "John 5", 85);
		List<MyClass> myList = new ArrayList<>();
		myList.add(myClass1);
		myList.add(myClass2);
		myList.add(myClass3);
		myList.add(myClass4);
		myList.add(myClass5);
		myClassDeserialization = new MyClassDeserialization();
		assertEquals(myList,myClassDeserialization.readObjectInFile("myclass.ser"));
	}

}
