package com.BridgeLabs.inventoryfactory.dataimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BridgeLabs.Oops.InventoryManagement.data.InventoryInterface;
import com.BridgeLabs.inventoryfactory.data.InventoryFactoryInterface;
import com.BridgeLabs.inventoryfactory.modal.Inventory;

public class InventoryFactoryImplementation implements InventoryFactoryInterface{
	//Inventory inventory= new Inventory();
	
	JSONObject jobject;
	JSONArray jsonArray;
	List<Inventory> rice= new ArrayList<Inventory>();
	List<Inventory> pulses = new ArrayList<Inventory>();
	List<Inventory> weight=new ArrayList<Inventory>();
	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
			try {
				jobject =  (JSONObject) parser.parse(new FileReader("C:\\Users\\DIVYA.M\\Desktop\\BRIDGE LABS\\DataStructures\\src\\com\\BridgeLabs\\inventoryfactory\\modal\\Factory1.json"));
					System.out.println(jobject);
					jsonArray=(JSONArray) jobject.get("pulses");
				for (Object obj : jsonArray) {
					Inventory inventory = new Inventory();

					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					double price = ((Long) jobject.get("price")).doubleValue();
					long weight = ((Long) jobject.get("weight"));

					inventory.setWeight(weight);
					inventory.setName(name);
					// System.out.println(inventory.getName());

					// System.out.println(inventory.getWeight());
					inventory.setPrice(price);
					// System.out.println(inventory.getPrice());
					jsonArray.add(inventory);

					System.out.println(inventory.toString());
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
	public void add(String name, long price, long weight) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
