package org.bank;

public class Canara  extends Rbi {
	
	private void balance() {
    
		System.out.println("balance 10000");

	}
	private void deposit() {
System.out.println("deposit");

	}
	
public static void main(String[] args) {
	
	Canara c=new Canara();
	
	c.balance();
	c.deposit();
	c.adharId();
	c.savings();
	
	
	
	
	
}
}
