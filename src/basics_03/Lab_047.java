package src.basics_03;
import java.util.Scanner;

public class Lab_047
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();

    if(a%2==1)
   {
       System.out.println("Odd number");
        }else
       {
           System.out.println("Even Number");
       }
   }
}
