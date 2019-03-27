package com.capgemini.file.tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileExistsTest {
	@Test
	public void testFileIsExistingOrNot() {
		File file =new File("C:\\RAM\\BankAccount.java");
		File file2=new File("C:\\RAM\\nofile.java");
		assertTrue(file.exists());
		assertFalse(file2.exists());
	}
	

}
