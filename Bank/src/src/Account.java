package src;

public class Account {
	private boolean closed = false;
	private boolean debt = false;
	private long balance = 0;
	private Person owner;
	
	public Account() {}

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
		if (!closed){
			this.balance += amount;
			if(this.balance >= 0)
				this.debt = false;
		}
	}
	public void withdraw(long amount) {
		if(!closed){
			this.balance -= amount;
			if(this.balance >= 0)
				this.debt = true;
		}
	}
	
}
