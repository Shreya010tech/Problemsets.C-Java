package ques;
import java.util.Scanner;
public class ques2 {

	public static void main(String[] args) {
		System.out.println("Enter the distance(in kms): ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = a * 1000;
		int c = a * 3281;
		int d = a * 39370;
		int e = a * 100000;
		
		System.out.println("The distance in meter will be: "+b);
		System.out.println("The distance in feet will be: "+c);
		System.out.println("The distance in inche will be: "+d);
		System.out.println("The distance in centimeter will be: "+e);
}
}
