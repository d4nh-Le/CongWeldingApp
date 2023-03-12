package models;

public class item {
	
private String itemName; 
private String itemID;
private int itemAmount; 
private String itemCategory;
private int itemPrice; 
private int itemSold;

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
	return itemCategory;
}
public void setItemCategory(String itemCategory) {
	this.itemCategory = itemCategory;
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
