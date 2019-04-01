package com.BridgeLabs.DataStructures;

import java.util.Scanner;

import com.BridgeLabs.Util.MyQueue;

public class BankingCashCounter {

	public static void main(String[] args) {

		System.out.println("enter the amount to be Withdraw");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		System.out.println(" enter no of persons  in queue");
		int persons = input.nextInt();
		MyQueue queue = new MyQueue(persons);
		int j = 1;
		for (int i = 0; i < persons; i++) {
			queue.insert(i);
		}
		while (j <= persons) {
			System.out.println("Welcome to CashCounter !!");
			System.out.println("Select your options .......... \n" + "1. Withdraw\n " +

					"2 . Deposite \n " + " 3. Check Balance \n " + "4. Exit");

			int select = input.nextInt();

			switch (select) {

			case 1: {
				System.out.println("enter the aamount to withdraw");
				int withdraw = input.nextInt();
				if (amount > withdraw) {
					System.out.println("enter amount to withdraw");
					amount = amount - withdraw;
				} else
					System.out.println(" Sufficinet money is not present");
				break;

			}
			case 2: {

				System.out.println("enter amount to deposite");
				int deposite = input.nextInt();
				amount = amount + deposite;
				System.out.println("money deposited");
				break;
			}

			case 3: {

				System.out.println("Available balance = " + amount);
				break;
			}

			case 4: {

				queue.remove();
				j++;
				System.out.println("Come Again");
				System.out.println("Person gone  from the queue");
				break;
			}

			default:
				System.out.println("Select a valid option");
			}

		}

	}
}
