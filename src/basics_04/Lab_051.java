package src.basics_04;

import java.util.Scanner;

public class Lab_051
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("Your score is A");
        }
        else if(score>=90 && score<=89)
        {
            System.out.println("Your score is B");
        }
        else if(score>=70 && score<=79)
        {
            System.out.println("Your score is C");
        }
        else if(score>=60 && score<=69)
        {
            System.out.println("Your score is D");
        }
        else
        {
            System.out.println("Your score is F");
    }
    }
}
