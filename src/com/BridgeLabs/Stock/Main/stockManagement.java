package com.BridgeLabs.Stock.Main;

import com.BridgeLabs.Stock.dataImpl.StockImplementation;

public class stockManagement {
	
   public static void main(String[] args) {
	   
	   
	   StockImplementation stockimpl= new StockImplementation();
	   stockimpl.readFile();
	   stockimpl.calculateTotal();
	   
	
}

}
