package ques;
import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 

		System.out.println("Enter outside temperature in Fahrenheit):  ");

	       double temp = input.nextDouble();

	       System.out.println("Enter wind speed in miles per hour: ");

	       double speed = input.nextDouble();

	       double wct = 35.74 + (0.6215 * temp) - (35.75

	               * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));

	       wct = (int) (wct * 100000) / 100000.0;

	 

	       System.out.println("”Wind Chill Temperature =  " + wct + "\n");
	}

}
