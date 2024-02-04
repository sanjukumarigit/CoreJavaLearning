package src.basics_03;

public class Lab_038
{
    public static void main(String[] args) {
        int a=40;
        int b=20;
        int c=32;

        var max=(a>b)?((a>c?a:c)):((b>c)?b:c);
        System.out.println(max);


    }
}
