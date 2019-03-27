package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	private String path;
	FileReader fileReader;
	BufferedReader bufferReader;

	public LineCount(String path) throws FileNotFoundException {
		super();
		this.path = path;
		fileReader = new FileReader(path);
		bufferReader = new BufferedReader(fileReader);

	}

	public LineCount() {
		super();
	}

	public int lineCount() throws IOException {

		int count = 0;
		while (this.bufferReader.readLine() != null) {
			count = count + 1;

		}
		System.out.println(count);
		bufferReader.close();
		fileReader.close();
		return count;

	}
}