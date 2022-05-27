package ques;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			Float a1 , a2 , a3 ,a4 ,a5 , agg , per;
			System.out.println("Enter the marks: ");
			a1=sc.nextFloat();
			a2=sc.nextFloat();
			a3=sc.nextFloat();
			a4=sc.nextFloat();
			a5=sc.nextFloat();
			agg=a1+a2+a3+a4+a5;
			per=agg/500*100;
			System.out.println("Aggregate: "+agg);
			System.out.println("Percentage: "+per);
		}

	}

}
