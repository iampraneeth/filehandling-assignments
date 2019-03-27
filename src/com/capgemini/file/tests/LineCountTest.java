package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.LineCount;

public class LineCountTest {
	private LineCount lineCount1;
	private File file = new File("C:\\RAM\\example.txt");

	@Test
	public void testTheNumberOfLinesInFile() throws IOException {
		lineCount1 = new LineCount("C:\\RAM\\example.txt");
		assertEquals(8, lineCount1.lineCount());

	}

	@Test
	public void testFileExistsOrNot() {

		assertTrue(file.exists());
	}
	@Test
	public void testFileIsEmpty() {
		
	}

}
