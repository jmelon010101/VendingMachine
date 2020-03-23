package com.techelevator.items;

import java.math.BigDecimal;

public abstract class Item {
	//should not have type
	private final String name;
	private final BigDecimal price;
	private final String type;
	private final String slotNumber;
	private int quantity = 5;
	
	public Item(String name, BigDecimal price, String type, String slotNumber) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.slotNumber = slotNumber;
	}

	//-----------------Methods--------------------------------------
	
	public String getSound() {
		return null;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
	
	//-----------------Getters and Setters---------------------------
	
	public int getQuantity() {
		if (quantity==0) {
			return 0;
		}
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public String getSlotNumber() {
		return slotNumber;
	}
	
}
