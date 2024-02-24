package Loop;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     int operation=sc.nextInt();
	     System.out.println("please enter operation");
	     System.out.println("1:Take money");
	     System.out.println("2:put money to your balance");
	     System.out.println("3:To exit");
	      
	     while(true) {
	    	if(operation==1) {
	    	System.out.println("Enter balance");
	    	int balance=sc.nextInt();
	    	System.out.println("Enter money that u want to take");
	    	int money=sc.nextInt();
	    	if(money>balance) {
	    		System.out.println("you can not do this operation");
	    	}
	    	else {
	    		System.out.println("you got your money:"+ money);
	    	}
	    	}
	    	else if(operation==2) {
	    		System.out.println("enter your balance ");
	    		int balance=sc.nextInt();
	    		System.out.println("enter the money that u want to put");
	    		int put=sc.nextInt();
	    	}
	     }
	}
}

	


