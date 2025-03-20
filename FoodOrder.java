package core;

import java.util.Scanner;

public class FoodOrder {
	String bill = "";
	double amount = 0.0;
	static FoodOrder foodOrder = new FoodOrder();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		foodOrder.welcome(scanner);
	}

	public void mainMenu() {
		System.out.println("1. Soups");
		System.out.println("2. Starters");
		System.out.println("3. Main Course");
		System.out.println("4. Desserts");
		System.out.println("5. Bill");
	}

	public void welcome(Scanner scanner) {
		System.out.println("Online Food Order System\n");
		while (true) {
			foodOrder.mainMenu();
			switch (scanner.nextInt()) {
			case 1 -> foodOrder.soups(scanner);
			case 2 -> foodOrder.starters(scanner);
			case 3 -> foodOrder.mainCourse(scanner);
			case 4 -> foodOrder.desserts(scanner);
			case 5 -> foodOrder.bill();
			}
		}
	}

	public void soupsMenu() {
		System.out.println("1. Chicken Manchow Soup - 120");
		System.out.println("2. Veg Manchow Soup - 120");
		System.out.println("3. Tomato Soup - 80");
		System.out.println("4. Paya Soup - 250");
	}

	public void soups(Scanner scanner) {
		foodOrder.soupsMenu();
		switch (scanner.nextInt()) {
		case 1: {
			bill += "Chicken Manchow Soup - 120\n";
			amount += 120;
		}
		case 2: {
			bill += "Veg Manchow Soup - 120\n";
			amount += 120;
		}
		case 3: {
			bill += "Tomato Soup - 80\n";
			amount += 80;
		}
		case 4: {
			bill += "Paya Soup - 250\n";
			amount += 250;
		}
		}
	}

	public void startersMenu() {
		System.out.println("1. Panner Majestic - 270");
		System.out.println("2. Babycorn Manchurian - 220");
		System.out.println("3. Chicken Lollipop - 280");
		System.out.println("4. Tandoori Grilled Fish - 350");
		System.out.println("5. Prawns Ghee Roast - 370");
	}

	public void starters(Scanner scanner) {
		foodOrder.startersMenu();
		switch (scanner.nextInt()) {
		case 1: {
			bill += "Panner Majestic - 270\n";
			amount += 270;
		}
		case 2: {
			bill += "Babycorn Manchurian - 220\n";
			amount += 220;
		}
		case 3: {
			bill += "Chicken Lollipop - 280\n";
			amount += 280;
		}
		case 4: {
			bill += "Tandoori Grilled Fish - 350\n";
			amount += 350;
		}
		case 5: {
			bill += "Prawns Ghee Roast - 370\n";
			amount += 370;
		}
		}
	}

	public void mainCourseMenu() {
		System.out.println("1. Chicken Dum Biryani - 270");
		System.out.println("2. Joint Biryani - 300");
		System.out.println("3. Prawns Biryani - 350");
	}

	public void mainCourse(Scanner scanner) {
		foodOrder.mainCourseMenu();
		switch (scanner.nextInt()) {
		case 1: {
			bill += "Chicken Dum Biryani - 270\n";
			amount += 270;
		}
		case 2: {
			bill += "Joint Biryani - 300\n";
			amount += 300;
		}
		case 3: {
			bill += "Prawns Biryani - 350\n";
			amount += 350;
		}
		}
	}

	public void dessertsMenu() {
		System.out.println("1. Apricot Delight - 270");
		System.out.println("2. Gulab Jamun - 120");
		System.out.println("3. Brownie with Icecream - 220");
	}

	public void desserts(Scanner scanner) {
		foodOrder.dessertsMenu();
		switch (scanner.nextInt()) {
		case 1: {
			bill += "Apricot Delight - 270\n";
			amount += 270;
		}
		case 2: {
			bill += "Gulab Jamun - 120\n";
			amount += 120;
		}
		case 3: {
			bill += "Brownie with Icecream - 220\n";
			amount += 220;
		}
		}
	}

	public void bill() {
		System.out.println("\n" + bill + "\n");
		System.out.println("----------------------------------");
		System.out.println("Total :      " + amount);
		System.exit(0);
	}
}
