package models;

public class transaction {
	
	private int transactionID;
	private int transactionTYPE; // I for in-transaction; O for out-transaction
	private customer transactionCustomer;
	
	
	public transaction(int transactionID, int transactionTYPE, customer transactionCustomer) {
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


	public void setTransactionTYPE(int transactionTYPE) {
		this.transactionTYPE = transactionTYPE;
	}


	public customer getTransactionCustomer() {
		return transactionCustomer;
	}


	public void setTransactionCustomer(customer transactionCustomer) {
		this.transactionCustomer = transactionCustomer;
	}
	
	

}
