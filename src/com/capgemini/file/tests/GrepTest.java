package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import com.capgemini.file.model.Grep;

public class GrepTest {

	private Grep grep;
	private File file;

	@Test
	public void testFileIsExistingOrNot() {
		File file = new File("C:\\RAM\\example1.txt");

		assertTrue(file.exists());
		assertFalse(!file.exists());
	}

	@Test
	public void testStringExist() {
		grep = new Grep();
		assertEquals("5 6 7 8 9 ", grep.WordFoundInLine("C:\\RAM\\example1.txt", "ten"));

	}

}
