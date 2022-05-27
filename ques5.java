package ques;
import java.util.Scanner;
public class ques5
{
  double pi = 3.14,perimeter;
  Scanner s = new Scanner(System.in);
  void circle()
  {
      System.out.println("Enter the radius of circle: ");
      int radius = s.nextInt();
      perimeter = 2 * pi * radius;
      System.out.println("The perimeter of the circle: "+perimeter);
  } 
  void rectangle()
  {
      System.out.println("Enter length of rectangle: ");
      int length = s.nextInt();
      System.out.println("Enter breadth of rectangle: ");
      int breadth = s.nextInt();
      perimeter = 2 * (length + breadth);
      System.out.println("The perimeter of the rectangle: "+perimeter);
  }
  public static void main(String[] args) {
	  Scanner io = new Scanner(System.in);
	  System.out.println("Input the radius of the circle: ");
	  double radius = io.nextDouble();
	  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
	  System.out.println("Area is = " + (Math.PI * radius * radius));
	 }
   {
      ques5 obj=new ques5();
      obj.circle();
      obj.rectangle();
   }
}