package p1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AccountFrontEnd {

	AccountBackendOperations backend = new AccountBackendOperations();
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		AccountFrontEnd app = new AccountFrontEnd();
		
		while(true)
		{
			System.out.println("=== MAIN ======");
			System.out.println("1. Add Account");
			System.out.println("2. Search Account Based on Account number ");
			System.out.println("3. Show All Accounts");
			System.out.println("0. EXIT");
			
			int choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				app.addAccount();
				break;
			case 2: app.showAll();
			break;

			default:
				break;
			}
			
		}//end while
	}//end main
	
	public void addAccount()
	{
		System.out.println("Enter Account Holder Name ");
		String name = sc.nextLine();
		System.out.println("Enter Location ");
		String location = sc.nextLine();
		System.out.println("Enter Openning Balance ");
		int balance = sc2.nextInt();
		
		Account savedAccount = backend.addAccount(name, balance, location);
		System.out.println(savedAccount);
		
	}
	
	public void showAll()
	{
		List<Account> accountsFromBackEnd = backend.getAllRecords();
		for (Account account : accountsFromBackEnd) {
			System.out.println(account);
		}
	}
	
}//end class
