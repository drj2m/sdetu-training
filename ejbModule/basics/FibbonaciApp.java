package basics;

public class FibbonaciApp {

	public static void main(String[] args) {
		// Fibbonaci numbers
		//f(0)=0
		//f(1)=1
		//f(2)=f(1)+f(0)
		//f(3)=f(2)+f(1)
		System.out.println(fib(6));
	
	}
	
	
	public static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return(fib(n-1)+fib(n-2));
					
	}
	

	

}
