package basics;

public class Assignment1 {

	public static void main(String[] args) {
		//Finding maximum, minimum and average numbers.
		int[] n= {21,21,21};
		System.out.println("the maximum is " + maximum(n));
		System.out.println("the minimum is " + minimum(n));
		System.out.println("the average of three array is " + average(n));
		
	}
		static int maximum(int[] n) {
			if((n[0]>n[1])&&(n[0]>n[2])) {
				return n[0];
			}
			else if((n[1]>n[2])&&(n[1]>n[0])) {
				return n[1];
			}
			else if((n[2]>n[1])&&(n[2]>n[0])) {
				return n[2];
			}
			return 0;
		}	
		static int minimum(int[] n) {
			if((n[0]<n[1])&&(n[0]<n[2])) {
				return n[0];
			}
			else if((n[1]<n[2])&&(n[1]<n[0])) {
				return n[1];
			}
			else if((n[2]<n[1])&&(n[2]<n[0])) {
				return n[2];
			}
			return 0;
		}	
		

          static int average(int[] n) {
	       int sum, average;
	        sum=n[0]+n[1]+n[2];
	        average=sum/2;
	        return average;
          }
} 

	

	