package ques;
import java.util.Scanner;
public class ques13 {

	public static void main(String[] args) {
		int C, D, t;
		Scanner SC = new Scanner(System.in);
		System.out.println ("Enter the contents of C and D");
		C = SC.nextInt();
		D = SC.nextInt();
	
		t = C;
		C = D;
		D = t;
		System.out.println("After interchange:"+C +" " +D);
		System.out.println();
	}

}
