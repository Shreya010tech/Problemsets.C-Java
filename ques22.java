package ques;
import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any Number: ");
        num = sc.nextInt();
        if (num < 0) {
            num = num * (-1);
            System.out.println("The exact value of given number:   " + num);
        }

    }
}