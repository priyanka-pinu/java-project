package firstprogram;

import java.util.Scanner;

public class Sumofevennumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a number(n:)");
		    int n=sc.nextInt();
		    int sum=0;
		    for(int i=2;i<=n;i+=2) {
			sum+=i;
		    
			}
		    System.out.println("Sum of even numbers from 1 to"+n+"is:"+sum);
			}


	}


