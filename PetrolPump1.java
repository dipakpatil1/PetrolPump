package Day_2;

import java.util.*;

class Pump {
	float price;
	double amount, quantity;

	void setPirce(float p) { // Setting the price of petrol
		price = p;
	}

	void getPrice() { // printing the price of petrol
		System.out.println("The price of Petrol is : " + price);
	}

	Pump() { // creating the constructor to initialize the amount and quantity
		amount = 0.0;
		quantity = 0.0;

		System.out.println("The Amount is : " + amount);
		System.out.println("The Quantity is : " + quantity);
	}

	void enterAmount() { // Taking amount as input
		System.out.println("Enter amount >10 : \n");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextDouble();
		quantity = amount / price;
		System.out.println("Quantity is : " + (float) quantity + " Litre");
		System.out.println("Your Bill is  : " + amount + " rupee");
	}

	void enterQuantity() { // Taking quantity as input
		System.out.println("Enter Quantity in Litres: ");
		Scanner sc = new Scanner(System.in);
		quantity = sc.nextDouble();
		amount = quantity * price;
		System.out.println("Quantity is : " + quantity + " Litre");
		System.out.println("Your Bill is : " + amount + " rupee");
	}
}

public class PetrolPump1 {
	public static void main(String[] args) {
		String choice;

		Pump p1 = new Pump(); // creating object for pump class
		p1.setPirce(90);
		p1.getPrice();

		System.out.println("Enter q for  Quantity or a for Amount "); // asking the user for his choice
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();

		switch (choice) {
		case "q":
			p1.enterQuantity(); // calling the enterQuantity method
			break;
		case "a":
			p1.enterAmount(); // calling the enterAmount method
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
