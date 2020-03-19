package basics;

public class SalaryCalculator {
   public static void main(String[] args) {
	   //Let's create a variable to define our career
	   
	   //Declare a variable
	   String career;
	   System.out.println("program is starting");
	   career="Software developer";
	   
	   //declare and define
	   int hoursperweek=40;
	   int weeksperyear=50;
	   double rate=42.5;
	   double salary=hoursperweek*weeksperyear*rate;
	   System.out.println("my salary is as a " + career + " is " + salary);
   }
}
