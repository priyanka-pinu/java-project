package firstprogram;

public class Palindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=452;
		temp=n;
		while(n>0){
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome number");
		

	}

}
