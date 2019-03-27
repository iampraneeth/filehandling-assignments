package com.capgemini.file.model;

import java.io.Serializable;

public class BankAccount implements Serializable{
	private int accountId;
	private String accountFolderName;
	private String accountType;
	private double accountBalance;
	private transient DebitCard debitCard;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountFolderName() {
		return accountFolderName;
	}
	public void setAccountFolderName(String accountFolderName) {
		this.accountFolderName = accountFolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	public BankAccount(int accountId, String accountFolderName, String accountType, double accountBalance,
			DebitCard debitCard) {
		super();
		this.accountId = accountId;
		this.accountFolderName = accountFolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.debitCard = debitCard;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountFolderName=" + accountFolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", debitCard=" + debitCard + "]";
	}

}
