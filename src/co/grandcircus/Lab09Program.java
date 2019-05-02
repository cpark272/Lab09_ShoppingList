//Chan Park
//Lab 9 Shopping List
//2019-05-02

package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab09Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Initialize variables
		double totalPrice = 0.0;
		String userInput = null;
		
		// 4 ArrayLists called from the ArrayList methods
		ArrayList<String>itemName = listOfNames();
		ArrayList<Double>itemPrice = listOfPrices();
		ArrayList<String>orderName = listOfOrderNames();
		ArrayList<Double>orderPrice = listOfOrderPrices();
		
//		System.out.println(itemName);
//		System.out.println(itemPrice);
		
		do {
			// Menu of store items and prices
			System.out.println("Welcome to Guenther's Market!");
			System.out.println("\nItem   Price");
			System.out.println("============");
			
			// for-loops to print out the items and their prices on each return line
			for (int i = 0; i < itemName.size(); i++) {
				System.out.println(itemName.get(i) + "   " + itemPrice.get(i));
			}
			
			// Prompts user to input an item on the menu to order
			System.out.print("What item would you like to order? ");
			String orderNameInput = scan.next();
			
			//do {
			
				// Checks if the entered menu item exists
				// for loop increments through the itemName ArrayList
				for (int j = 0; j < itemName.size(); j++) {
				
					// if-else statement evaluates if the item entered by user is valid
					if(orderNameInput.equals(itemName.get(j))) {
						orderName.add(itemName.get(j));
						orderPrice.add(itemPrice.get(j));				
						System.out.println("Adding " + itemName.get(j) + " to cart at $" + itemPrice.get(j));
						// System.out.println(orderName);
						// System.out.println(orderPrice);
					}
					
					//break;
					
				}
				
			//} while (userInput.equalsIgnoreCase("y"));
			//System.out.println("Sorry, we don't have those. Please try again.");
									
			// Prompts user to ask if they want know more
			System.out.print("Would you like to order anything else? (y/n)? ");
			userInput = scan.next();
			System.out.println();
			
		} while (userInput.equalsIgnoreCase("y"));

		// End of program
		System.out.println("Thanks for your order!");
		System.out.println("Here's what you got:");
		
		for (int k = 0; k < orderName.size(); k++) {
			totalPrice = orderPrice.get(k) + totalPrice;
			System.out.println(orderName.get(k) + "   " + orderPrice.get(k));
		}
		
		double averagePrice = totalPrice/(orderName.size());
		
		System.out.println("Average price per item in order was " + averagePrice);

		scan.close();

}
	
	public static ArrayList<String> listOfNames() {
		
		ArrayList<String>itemName = new ArrayList<>();
		
		itemName.add("apple");
		itemName.add("banana");
		itemName.add("cauliflower");
		itemName.add("dragonfruit");
		itemName.add("Elderberry");
		itemName.add("figs");
		itemName.add("grapefruit");
		itemName.add("honeydew");
		
		return itemName;
	}
	
	public static ArrayList<Double> listOfPrices() {
		
		ArrayList<Double>itemPrice = new ArrayList<>();
		
		itemPrice.add(0.99);
		itemPrice.add(0.59);
		itemPrice.add(1.59);
		itemPrice.add(2.19);
		itemPrice.add(1.79);
		itemPrice.add(2.09);
		itemPrice.add(1.99);
		itemPrice.add(3.49);
		
		return itemPrice;
	}
	
	public static ArrayList<String> listOfOrderNames() {
		
		ArrayList<String>orderName = new ArrayList<>();
		
		return orderName;
		
	}
	
	public static ArrayList<Double> listOfOrderPrices() {
		
		ArrayList<Double>orderPrice = new ArrayList<>();
		
		return orderPrice;
	}
	
	public static double averagePrice() {
		
		
		
		return 0;
	}

	

}
