package com.BridgeLabs.Stock.dataImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BridgeLabs.Oops.InventoryManagement.Inventory;
import com.BridgeLabs.Stock.data.StockInterface;
import com.BridgeLabs.Stock.modal.StockPojo;

public class StockImplementation implements StockInterface{

	@Override
	public void readFile() {
		
		JSONArray jsonArray;
		List<StockPojo> stocklist = new ArrayList<>();

		JSONObject jobject = new JSONObject();

		
			JSONParser parser = new JSONParser();
			{
				try {
					FileReader fr = new FileReader("C:\\Users\\DIVYA.M\\Desktop\\BRIDGE LABS\\DataStructures\\src\\stock.json");
					jsonArray = (JSONArray) parser.parse(fr);

					for (Object obj : jsonArray) {
						StockPojo stock = new StockPojo();

						jobject = (JSONObject) obj;
						String name = (String) jobject.get("name");
						long stockShares = ((Long) jobject.get("share"));
						long price = ((Long) jobject.get("sharePrice"));

						stock.setStockName(name);
						stock.setPrice(price);
						stock.setStockShares(stockShares);
						// System.out.println(inventory.getName());

						// System.out.println(inventory.getWeight());
						
						// System.out.println(inventory.getPrice());
						

						System.out.println(stock.toString());
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


		
		
		
	

	@Override
	public void calculateTotal(String name, Long share, Long price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		
	}

}
