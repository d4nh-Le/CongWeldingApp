package models;

public class item {
	
private String itemName; 
private String itemID; 
private String itemTYPE; // E for equipment; M for machine; MISC for miscellaneous
private int itemPrice; 
private int itemAmount;
private int itemSold;



public item(String itemName, String itemID, String itemTYPE, int itemPrice) {
	super();
	this.itemName = itemName;
	this.itemID = itemID;
	this.itemTYPE = itemTYPE;
	this.itemPrice = itemPrice;
}

public item(String itemName, String itemID, String itemTYPE, int itemPrice, int itemAmount, int itemSold) {
	super();
	this.itemName = itemName;
	this.itemID = itemID;
	this.itemTYPE = itemTYPE;
	this.itemPrice = itemPrice;
	this.itemAmount = itemAmount;
	this.itemSold = itemSold;
}

public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getItemID() {
	return itemID;
}
public void setItemID(String itemID) {
	this.itemID = itemID;
}
public int getItemAmount() {
	return itemAmount;
}
public void setItemAmount(int itemAmount) {
	this.itemAmount = itemAmount;
}
public String getItemCategory() {
	return itemTYPE;
}
public void setItemCategory(String itemCategory) {
	this.itemTYPE = itemCategory;
}
public int getItemPrice() {
	return itemPrice;
}
public void setItemPrice(int itemPrice) {
	this.itemPrice = itemPrice;
}
public int getItemSold() {
	return itemSold;
}
public void setItemSold(int itemSold) {
	this.itemSold = itemSold;
} 

}
