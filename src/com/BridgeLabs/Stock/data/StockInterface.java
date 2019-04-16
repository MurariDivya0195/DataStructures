package com.BridgeLabs.Stock.data;

public interface StockInterface {

	public void readFile();
	
	public void calculateTotal(String name, Long share, Long price);
	
	public void writeFile();
	
}
