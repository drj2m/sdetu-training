package basics;

public class sum {

	public static void main(String[] args) {
		// 
		
		System.out.println(sum(10));
	}
	 //Calculating the sum of n numbers;
	
	
	static int sum(int n){
	int  sum=0;
	for(int i=1;i<=n;i++)
	{ 
	  sum=sum + i;
	}
	return sum;
	}



}
