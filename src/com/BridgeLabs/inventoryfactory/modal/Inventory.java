package com.BridgeLabs.inventoryfactory.modal;

public class Inventory {
	
	private String name;
	private double price;
	private long weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price2) {
		this.price = price2;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight2) {
		this.weight = weight2;
	}
	

	@Override
    public String toString() {
        return "name: " + name + "\n "
                + "stockshare: " + weight + "\n "
                        + "price: " +  price + "";
    }

	
}
