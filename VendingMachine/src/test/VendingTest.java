package test;

import vending.Coin;
import vending.VendingMachine;

import junit.framework.*;

public class VendingTest extends TestCase {

	private VendingMachine vending;
	
	public void setUp(){
		vending = new VendingMachine();
		vending.setDrink(VendingMachine.COFFEE, 85, 10);
		vending.setDrink(VendingMachine.JUICE, 60, 20);
		vending.setDrink(VendingMachine.SODA, 115, 15);
	}

	public void test() {
		vending.insertCoin(Coin.DOLLAR);
		assertTrue("", vending.getDeposit()==100);
		vending.purchase(VendingMachine.COFFEE);	
		assertTrue("", vending.getCoffee().getCount()==9);
		assertTrue("", vending.getDeposit()==0);
	}
}
