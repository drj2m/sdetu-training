package oop;

public class BankAccountAppNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount1 acc1= new BankAccount1("account");
      BankAccount1 acc2= new BankAccount1("account");
      BankAccount1 acc3= new BankAccount1("account");
      
      
		
	}

}

class BankAccount1{
	private int id;
	private String AccountNumber;
	private String RoutingNumber;
	private String Name;
	private double Balance;
	private String SSN;


//Defining a constructor
public BankAccount1(String SSN){
	System.out.println("Account is created");
	
 }
}