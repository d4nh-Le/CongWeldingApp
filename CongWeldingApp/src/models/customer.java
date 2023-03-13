package models;

public class customer {
	
private int customerID; 
private String customerName; 
private char customerTYPE; // (I) for source, distributer | (O) for out customers 
private String customerPhone;
private String customerAddress;
private Character character;

public customer() {
	customerID = 0;
	customerName = null;
	character = (Character) null;
	customerTYPE = character;
	customerPhone = null;
	customerAddress = null;
}

public customer(int customerID, String customerName, char customerTYPE) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerTYPE = customerTYPE;
}


public customer(int customerID, String customerName, char customerTYPE, String customerPhone, String customerAddress) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.customerTYPE = customerTYPE;
	this.customerPhone = customerPhone;
	this.customerAddress = customerAddress;
}

public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public char getCustomerTYPE() {
	return customerTYPE;
}
public void setCustomerTYPE(char customerTYPE) {
	this.customerTYPE = customerTYPE;
}
public String getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
} 



}
