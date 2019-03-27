package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep {

	public String WordFoundInLine(String path, String str) {

		int count = 0, countBuffer = 0, countLine = 0;
		String lineNumber = "";
		BufferedReader br;
		String inputSearch = str;
		String line = "";

		try {
			br = new BufferedReader(new FileReader(path));
			try {
				while ((line = br.readLine()) != null) {
					countLine++;

					String[] words = line.split(" ");

					for (String word : words) {
						if (word.equals(inputSearch)) {
							count++;
							countBuffer++;
						}
					}

					if (countBuffer > 0) {
						countBuffer = 0;
						lineNumber += countLine + " ";
					}

				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lineNumber;
	}
}
