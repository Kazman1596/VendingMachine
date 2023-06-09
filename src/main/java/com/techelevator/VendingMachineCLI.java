package com.techelevator;


import com.techelevator.view.Inventory;
import com.techelevator.view.Menu;
import com.techelevator.view.Transaction;

import java.util.Scanner;

public class VendingMachineCLI {
	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_SECRET_OPTION = "*Sales Report";
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_SECRET_OPTION };

	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};

	Scanner scanner = new Scanner(System.in);
	private Menu menu;
	Transaction transaction = new Transaction();
	Inventory inventory = new Inventory();


	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				inventory.displayInventory();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
					System.out.println("Input $(1), $(5), or $(10) bill please:");
					String moneyInput = scanner.nextLine();
					transaction.setBalance(moneyInput);
					transaction.displayBalance();
				} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {

					inventory.displayInventory();
					System.out.println("Please enter item code: ");
					String userInput = scanner.nextLine().toUpperCase();
					transaction.dispenseItem(userInput);
				} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
					break;
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				break;
			}
		}
	}


	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
