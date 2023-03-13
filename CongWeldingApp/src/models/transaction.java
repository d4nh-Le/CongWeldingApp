package models;

public class transaction {
	
	private int transactionID;
	private char transactionTYPE; // I for in-transaction; O for out-transaction
	private customer transactionCustomer;
	private Character character;
	
	public transaction() {
		transactionID = 0;
		character = (Character) null;
		transactionTYPE = character;
		transactionCustomer = null;
		
	}
	
	
	public transaction(int transactionID, char transactionTYPE, customer transactionCustomer) {
		super();
		this.transactionID = transactionID;
		this.transactionTYPE = transactionTYPE;
		this.transactionCustomer = transactionCustomer;
	}


	public int getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}


	public int getTransactionTYPE() {
		return transactionTYPE;
	}


	public void setTransactionTYPE(char transactionTYPE) {
		this.transactionTYPE = transactionTYPE;
	}


	public customer getTransactionCustomer() {
		return transactionCustomer;
	}


	public void setTransactionCustomer(customer transactionCustomer) {
		this.transactionCustomer = transactionCustomer;
	}
	
	

}
