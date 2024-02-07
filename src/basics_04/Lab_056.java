package src.basics_04;

import java.util.Scanner;

public class Lab_056
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1-7, i will tell you which day it is");
        int dayNumber=sc.nextInt();
        switch (dayNumber)
        {
            case 1:
                 System.out.println("Mon");
                 break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Are you mad");



        }

    }
}
