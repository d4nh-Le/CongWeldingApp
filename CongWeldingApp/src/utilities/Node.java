package utilities;

import models.*;

public class Node {
	
	Node next;
	item item;
	transaction transaction;
	customer customer; 
	
	public Node (item item) {
		this.item = item;
		this.next = null; 
	}
	
	public Node (transaction transaction) {
		this.transaction = transaction;
		this.next = null;
	}
	
	public Node (customer customer) {
		this.customer = customer;
		this.next = null;
	}
}
