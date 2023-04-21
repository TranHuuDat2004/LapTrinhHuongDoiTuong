package lab1;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("----Menu----\n1. Coca\n2. Pepsi\n3. Sprite\n4. Snack\n5. Shutdown Machine");
			System.out.println("Input number: ");
			int number = sc.nextInt();
			double amountOfMoney = 0;
			double remainMoney = 0;
			switch (number) {
			case 1:
				double priceOfCoca = 2;
				System.out.println("The price of Coca is " + priceOfCoca + "$, please enter the amount of money: ");
				amountOfMoney = sc.nextDouble();
				if (amountOfMoney >= priceOfCoca) {
					remainMoney = amountOfMoney - priceOfCoca;
					System.out.println("Your change is " + remainMoney + "$");
				} else {
					System.out.println("Not enough money to buy this item. Please select again");
				}
				break;
			case 2:
				double priceOfPepsi = 2.5;
				System.out.println("The price of Coca is " + priceOfPepsi + "$, please enter the amount of money: ");
				amountOfMoney = sc.nextDouble();
				if (amountOfMoney >= priceOfPepsi) {
					remainMoney = amountOfMoney - priceOfPepsi;
					System.out.println("Your change is " + remainMoney + "$");
				} else {
					System.out.println("Not enough money to buy this item. Please select again");
				}
				break;
			case 3:
				double priceOfSprite = 2;
				System.out.println("The price of Coca is " + priceOfSprite + "$, please enter the amount of money: ");
				amountOfMoney = sc.nextDouble();
				if (amountOfMoney >= priceOfSprite) {
					remainMoney = amountOfMoney - priceOfSprite;
					System.out.println("Your change is " + remainMoney + "$");
				} else {
					System.out.println("Not enough money to buy this item. Please select again");
				}
				break;
			case 4:
				double priceOfSnack = 5;
				System.out.println("The price of Coca is " + priceOfSnack + "$, please enter the amount of money: ");
				amountOfMoney = sc.nextDouble();
				if (amountOfMoney >= priceOfSnack) {
					remainMoney = amountOfMoney - priceOfSnack;
					System.out.println("Your change is " + remainMoney + "$");
				} else {
					System.out.println("Not enough money to buy this item. Please select again");
				}
				break;
			default:
				isRunning = false;
				break;
			}
		} while (isRunning);
		System.out.println("Machine is shutting down.");
		sc.close();
	}
}
