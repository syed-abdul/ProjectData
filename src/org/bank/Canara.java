package org.bank;

public class Canara  extends Rbi {
	
	private void balance() {
    
		System.out.println("balance 10000");

	}
	private void deposit() {
System.out.println("deposit");

	}

	private void ifscCode() {
		System.out.println("sbin0015703");
	}

	private void loanAmount() {
		System.out.println("1000000"); 

	}
	private void acName() {
		System.out.println("syed abdul rahman");
	}
	

public static void main(String[] args) {
	
	Canara c=new Canara();
	
	c.balance();
	c.deposit();
	c.adharId();
	c.savings();
    c.acName();
	c.ifscCode();
	

	
	c.loanAmount();

	
	
	
}
}
