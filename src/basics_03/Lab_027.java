package src.basics_03;

public class Lab_027
{
    public static void main(String[] args) {

        //widening is the process of converting lower type to higher type
        byte b=10;
        int a=b;  //implicit casting by JVM
        //int a =(int) b; //explicit casting by JVM

        //Narrowing is the process of converting higher type to lower type
        int a1=300;
       // byte b1=a1;//invalid implicit casting
        byte b1=(byte)a1;//explict
        System.out.println(b1);







    }
}
