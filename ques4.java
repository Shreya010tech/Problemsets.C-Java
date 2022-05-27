package ques;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		{
			double fahrenheit, celsius;
			Scanner s = new Scanner (System.in);
			System.out.println("Enter the temparature in Fahrenheit: ");
			fahrenheit = s.nextDouble();
		celsius = ((fahrenheit-32)*5)/9;
		System.out.println("Temparature in Celsius is: "+celsius);
		}

	}

}
