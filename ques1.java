package ques;
import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
		int s,r;
		Scanner z=new Scanner(System.in);
	     s=z.nextInt();
	     r=(s+(s*20)/100+(s*40)/100);
	     System.out.println("Gross Salary="+r);
	}

}
