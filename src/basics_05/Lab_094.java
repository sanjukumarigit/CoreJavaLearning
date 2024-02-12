package src.basics_05;

import java.util.Scanner;

public class Lab_094
{
    public static void main(String[] args) {
        //Factorial of a program
        //1!=1
        //2!=2*1
        //3!=3*2*1

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

        long fact=1;
        //5=i, 1 to 5--fact=fact*i;i++

        //A=int i=1
        //B=i<=number, i<=5
        //C=i++
        //D=fact=fact*i

       int i=1;
       while(i<=number){
           fact=fact*i;
           i++;
       }
        System.out.println("Fact   "  +fact);


    sc.close();

    }
}
