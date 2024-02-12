package src.basics_05;

public class Lab_085
{
    public static void main(String[] args) {
        for(int i=0;i<10;i++) //It will print 10 times from 0 o 9
        {
            System.out.println(i);
            if(i==3)continue;
            System.out.println("***AFTER");
        }
    }
}
