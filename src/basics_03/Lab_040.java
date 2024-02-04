package src.basics_03;

public class Lab_040
{
    public static void main(String[] args) {
        //increment operator
        //pre and post
        int a=10;
        a=a+1;
        a +=1;
        //a++ //post increment =a=a+1;
       // ++a //pre increment  =a=a+1;
        System.out.println(a);


        int b=20;
        System.out.println(b++);//First print then increment
        int c=20;
        System.out.println(++c);//First increment and then print


    }
}
