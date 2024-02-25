package src.basics_06_24Dec;

public class Lab_108
{
    public static void main(String[] args) {
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
