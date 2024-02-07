package src.basics_04;

import java.util.Scanner;

public class Lab_057
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name ");
        String browser=sc.next();
        switch (browser.toLowerCase())
        {
        case "chrome":
           System.out.println("Execute the chrome code");
            break;
        case "firefox":
            System.out.println("Execute the firfox code");
            break;
        case "edge":
            System.out.println("Execute the edge code");
            break;
        default:
            System.out.println("I have no idea which broswer it is");
        }
    }
}
