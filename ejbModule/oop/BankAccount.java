package oop;

public class BankAccount {
	String accountNumber="99999999";
    String routingNumber="334222";
	String SSN;
	String accountType;
	//Double initDeposit;
	
	//BankAccount(){
	//	System.out.println("Account is created " + accountNumber);
	//}
	BankAccount(){
		System.out.println("account number is " + routingNumber);
	}
    BankAccount(String accountType, double initDeposit){
		System.out.println("Initial deposit in $ is " + initDeposit);
		String msg="null";
		if (initDeposit<1000) {
			msg=" ERROR: inital deposit should be greater than $1000";
			System.out.println(msg);
		}
		else {
		System.out.println("Thank you for deposit");
	}
    }
	
	
	void deposit(){
		
		}

    
	void withdrawl() {
		
	}
	void checkStatus() {
		
			
	}
}
    