package src.basics_05;

import java.util.Scanner;

public class Lab_069
{
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=user_input.next();

        System.out.println("Enter your age");
        int age=user_input.nextInt();

        System.out.println("Enter your Salary");
        Double Salary=user_input.nextDouble();

        System.out.println("Your details is"    + name+  "  " +age+ " "  +Salary);
        user_input.close();


    }
}
