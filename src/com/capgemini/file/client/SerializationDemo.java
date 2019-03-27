package com.capgemini.file.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.file.model.BankAccount;
import com.capgemini.file.model.DebitCard;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DebitCard debitCard = new DebitCard(12345678912345l, 567, 12, 2020);
		BankAccount account = new BankAccount(101, "jiohn", "saving", 3400, debitCard);
		// serialization process
		FileOutputStream fileOutputsStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputsStream);

		objectOutputStream.writeObject(account);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		BankAccount account2=(BankAccount) inputStream.readObject();
		inputStream.close();
		System.out.println(account2);

	}

}
