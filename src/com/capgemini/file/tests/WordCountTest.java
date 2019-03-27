package com.capgemini.file.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.WordCount;

public class WordCountTest {
	private WordCount wordCount;

	@Test
	public void testTheWordCount() throws IOException {
		wordCount = new WordCount("C:\\RAM\\example1.txt");
		assertEquals(10, wordCount.wordCountInFile());
	}

}
