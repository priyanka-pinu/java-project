package Decisionmaking;

public class Nestedifelse2 {

	public static void main(String[] args) {

		int x=20; int y=30; int z=40;
		if(x>=y) {
			if(x>=z) {
				System.out.println(x +"is largest" );
			}
			else {
				System.out.println(z +"is largest");
			}
		}
		else {
			if(y>=z) {
				System.out.println(y +"is largest");
				
			}
			else {
				System.out.println(z +"is larger than y");
			}
		}
	}

}
