package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating an object and instantiating.
		BankAccount acc= new BankAccount();
		acc.accountNumber="689";
		BankAccount acc1= new BankAccount();
		acc1.accountNumber="689";
		
		BankAccount acc2= new BankAccount("initial deposit", 522);
	//	System.out.println("initial deposit: " + initDeposit);
		
		System.out.println(acc.routingNumber);
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		//acc.routingNumber="12345";
		
		System.out.println(acc.routingNumber);
		

	}

}
