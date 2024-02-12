package src.basics_05;

import java.util.Scanner;

public class Lab_068
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X");
        double x=sc.nextDouble();
        System.out.println("Enter the value of Y");
        double y=sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z=sc.nextDouble();


        double result =0;

        //x^2+y^2-z
        //a+b-z, A=x^2, B=y^2, C=abs |z| ---> |-1|=1,|-1222.23|=122.23
        result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        //Scanner stream should close teh program after we are done.

        sc.close();
    }
}
