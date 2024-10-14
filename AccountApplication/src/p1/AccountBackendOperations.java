package p1;

import java.util.ArrayList;
import java.util.List;

public class AccountBackendOperations {

	List<Account> allAccounts = new ArrayList<>();
	
	public Account addAccount(String name,int balance,String location)
	{
		Account a = new Account(name, balance, location);
		allAccounts.add(a);
		return a;
	}
	
	
	public List<Account> getAllRecords()
	{
		return allAccounts;
	}
	
	public Account searchAccount(int searchAccountNumber)
	{
		for (Account account : allAccounts) {
			if(account.getAccountNumber() == searchAccountNumber)
			{
				return account;
			}
		}
		return null;
	}
	
	
}
