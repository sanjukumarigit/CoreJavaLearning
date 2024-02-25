package src.basics_06_24Dec;

import org.w3c.dom.ls.LSOutput;

public class Lab_107
{
    public static void main(String[] args) {

        for(int i=1;i<=100;i++)
        if(i%3 ==0 && i%5==0)
        {
            System.out.println("FizzBuzx");
        }
        else if(i%3==0)
        {
            System.out.println("Fizz");
        }
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        System.out.println("End of Program");
    }


}

