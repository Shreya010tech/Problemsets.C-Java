package ques;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       double x = sc.nextDouble();
       double y = sc.nextDouble();
       
       double a = (y/x);
       
       double r = Math.sqrt(x*x+y*y);
       double p = Math.atan(a);
       
       System.out.println(r);
       System.out.println(p);
	}

}
