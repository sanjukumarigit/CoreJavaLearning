package src.basics_05;

public class Lab_087
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            if(i%2==0)
            {
                System.out.println("Even value of " +i);
                continue;
            }
            System.out.println("Odd Value of " +i);
        }
    }
}
