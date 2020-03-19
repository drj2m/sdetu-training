package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		//declare and define functions.
		System.out.println("Nobody called me");
		printName();
		int numA=40;
		int numB=30;
		addNumbers(numA,numB);
		
		

	}
	 static void printName(){
		 
	   System.out.println("my name is Dereje");
	 }
	 
	 static void addNumbers(int numA, int numB) {
		 int sum=numA+numB;
		 System.out.println("the sum of namA and numB " + "is" + sum);
	}
	//multiplyNumbers();

}
