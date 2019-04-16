package com.BridgeLabs.Oops.InventoryManagement.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.BridgeLabs.Oops.InventoryManagement.data.InventoryInterface;
import com.BridgeLabs.Oops.InventoryManagement.dataimp.InventoryImplementation;

public class InventoryManagement1 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("unused")
		InventoryInterface inventoryinterface = new InventoryImplementation();
		InventoryImplementation imp= new InventoryImplementation();{
			InventoryManagement1 i = new InventoryManagement1();

			@SuppressWarnings("unused")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter new pulses");
			String name=sc.nextLine();
			System.out.println("enter new price");
			double price =sc.nextDouble();
			System.out.println("enter weight");
			double weight=sc.nextDouble();



			/*
			 * System.out.println("enter which type "); String name=sc.next();
			 * System.out.println("enter weight of that type"); int weight=sc.nextInt();
			 * System.out.println("enter price of that one"); double price= sc.nextDouble();
			 */
			imp.fileRead();
			imp.add(name, weight, price);
			imp.calculateInventory();
			imp.writeFile();
			imp.remove();
			
			/* inventaryImp.add(name,weight); */
			//            imp.writeFile(name, weight, price);

		}



	}

}
