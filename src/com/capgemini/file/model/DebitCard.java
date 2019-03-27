package com.capgemini.file.model;

import java.io.Serializable;

public class DebitCard {
	private long cardNumber;
	private int cv;
	private int expiryMonth;
	private int expiryYear;

	public DebitCard() {
		super();
	}

	@Override
	public String toString() {
		return "DebitCard [cardNumber=" + cardNumber + ", cv=" + cv + ", expiryMonth=" + expiryMonth + ", expiryYear="
				+ expiryYear + "]";
	}

	public DebitCard(long cardNumber, int cv, int expiryMonth, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cv = cv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

}
