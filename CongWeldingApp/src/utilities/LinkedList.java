package utilities;

import models.*;

public class LinkedList {
	Node head; 
	
	public LinkedList() {
		this.head = null; 
	}
	
	public void  appendToItem(item i) {
		Node newNode = new Node(i);
		
		if (this.head == null) {
            this.head = newNode;
            return;
        }
		
		Node current = this.head;
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;	
	}
	
	
	public void  appendToTransaction(transaction t) {
		Node newNode = new Node(t);
		
		if (this.head == null) {
            this.head = newNode;
            return;
        }
		
		Node current = this.head;
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;	
	}
	
	
	public void  appendToCustomer(customer c) {
		Node newNode = new Node(c);
		
		if (this.head == null) {
            this.head = newNode;
            return;
        }
		
		Node current = this.head;
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;	
	}
	
	public void insertToItem(item i, int position) {
		Node newNode = new Node(i);
		
		if (position == 0) {
			newNode.next = this.head;
			this.head = newNode;
			return;
		}
		
		Node current = this.head;
		int n = 0;
		
		while (current != null && n < position - 1) {
			current = current.next;
			n++;
		}
		
		if (current == null) {
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
	}
	
	
	public void insertToTransaction(transaction t, int position) {
		Node newNode = new Node(t);
		
		if (position == 0) {
			newNode.next = this.head;
			this.head = newNode;
			return;
		}
		
		Node current = this.head;
		int n = 0;
		
		while (current != null && n < position - 1) {
			current = current.next;
			n++;
		}
		
		if (current == null) {
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
	}
	
	
	public void insertToCustomer(customer c, int position) {
		Node newNode = new Node(c);
		
		if (position == 0) {
			newNode.next = this.head;
			this.head = newNode;
			return;
		}
		
		Node current = this.head;
		int n = 0;
		
		while (current != null && n < position - 1) {
			current = current.next;
			n++;
		}
		
		if (current == null) {
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
	}
	
	
	public void delete (int position) {
		
		if (this.head == null) {
			return;
		}
		
		Node current = this.head;
		
		if (position == 0) {
			this.head = current.next;
			return;
		}
		
		int n = 0;
		
		while (current != null && n < position - 1) {
			current = current.next;
			n++;
		}
		
		if (current == null || current.next == null) {
			return;
		}
		
		current.next = current.next.next;	
	}
	
	
	public int size() {
        int count = 0;
        Node current = this.head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
	
	
	public item getItemAt(int position) {
        if (this.head == null) {
            return null;
        }

        Node current = this.head;
        int n = 0;

        while (current != null && n < position) {
            current = current.next;
            n++;
        }

        if (current == null) {
        	return null;
        }

        return current.item;
    }
	
	
	public transaction getTransactionAt(int position) {
        if (this.head == null) {
        	return null;
        }

        Node current = this.head;
        int n = 0;

        while (current != null && n < position) {
            current = current.next;
            n++;
        }

        if (current == null) {
        	return null;
        }

        return current.transaction;
    }
	
	
	public customer getCustomerAt(int position) {
        if (this.head == null) {
        	return null;
        }

        Node current = this.head;
        int n = 0;

        while (current != null && n < position) {
            current = current.next;
            n++;
        }

        if (current == null) {
        	return null;
        }

        return current.customer;
    }

}
