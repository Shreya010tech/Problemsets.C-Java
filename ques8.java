package ques;
import java.util.Scanner;
public class ques8 {

	public static void main(String[] args) {
		Scanner sp= new Scanner(System.in);
		System.out.println("Enter the 1st side of the triangle: ");
		int a= sp.nextInt();
		
		System.out.println("Enter the 2nd side of the triangle: ");
		int b= sp.nextInt();
		
		System.out.println("Enter the 3rd side of the triangle: ");
		int c= sp.nextInt();
		
		if ((a+b)>c && (b+c)>a && (a+c)>b) {
			int s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle is: " + area);
		}
		
		else {
			System.out.println("The Triangle does't exist");
			
		}

	}

}
