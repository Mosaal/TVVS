package src;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Person> clients = new ArrayList<>();
	private ArrayList<Account> accounts = new ArrayList<>();
	
	
	public Bank() {
	}

	
	public boolean isClient(Person cli){
		return clients.contains(cli);
	}
	public boolean hasAccount(Person cli){
		for(int i = 0; i <= accounts.size(); i++){
			if (accounts.get(i).getOwner().equals(cli))
				return true;
		}
		return false;
	}
	public long totalBalance(Person cli){
		long total = 0;
		for(int i = 0; i <= accounts.size(); i++){
			if (accounts.get(i).getOwner().equals(cli))
				total += accounts.get(i).getBalance();
		}
		return total;
	}
	public boolean hasDebt(Person cli){
		for(int i = 0; i <= accounts.size(); i++){
			if (accounts.get(i).getOwner().equals(cli) && accounts.get(i).isIndebted())
				return true;
		}
		return false;
	}
	
	
	
	public void addClient(Person cli) {
		if (!isClient(cli)) {
			clients.add(cli);
		}
	}
	public void removeClient(Person cli) {
		if (isClient(cli)) {
			clients.remove(cli);
		}
	}
	
	public Account createAccount(Person cli, long balance){
		addClient(cli);
		Account acc = new Account(cli, balance);
		accounts.add(acc);
		return acc;
	}
	public void changeAccountOwner(Account acc, Person cli){
		if (clients.contains(cli) && accounts.contains(acc)) {
			
		}
	}
	
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public ArrayList<Person> getClients() {
		return clients;
	}
	
	public int getNumClients() {
		return clients.size();
	}
	public int getNumAccounts() {
		return accounts.size();
	}
}
