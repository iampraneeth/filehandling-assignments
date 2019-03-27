package com.capgemini.file.model;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	private String path;
	private int count1 = 0;
	private String lineCount;
	BufferedReader bufferedReader;
	FileReader fileReader;

	public WordCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WordCount(String path) throws FileNotFoundException {
		super();
		this.path = path;

	}

	public int wordCountInFile() throws IOException {
		fileReader = new FileReader(this.path);
		bufferedReader = new BufferedReader(fileReader);

		while ((lineCount = bufferedReader.readLine()) != null) {
			if (!(lineCount.equals(""))) {
				String[] wordList = lineCount.split(" ");
				count1 += wordList.length;

			}
		}
		bufferedReader.close();
		fileReader.close();
		return count1;
	}

}
