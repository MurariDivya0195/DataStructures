package com.BridgeLabs.inventoryfactory.data;

public interface InventoryFactoryInterface {
	public void fileRead();
	public void add(String name, long price, long weight);
	public void remove();
	public double calculate(double price);
	public void writeFile();

}
