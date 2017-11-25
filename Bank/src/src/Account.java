package src;

public class Account {
	private boolean closed = false;
	private boolean debt = false;
	private long balance = 0;
	private Person owner;
	
	public Account(Person owner, long amount) {
		this.owner = owner;
		this.balance = amount;
		if (amount < 0)
			this.debt = true;
	}

	public boolean isClosed() {
		return closed;
	}
	public void close() {
		this.closed = true;
	}
	public void open() {
		this.closed = false;
	}
	
	public boolean isIndebted() {
		return debt;
	}

	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}




	public long getBalance() {
		return balance;
	}



	public void deposit(long amount) {
		this.balance += amount;
		if(this.balance >= 0)
			this.debt = false;
	}
	public void withdraw(long amount) {
		this.balance -= amount;
		if(this.balance >= 0)
			this.debt = true;
	}
	
}
