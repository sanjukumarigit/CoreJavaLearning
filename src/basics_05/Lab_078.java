package src.basics_05;

public class Lab_078 {
    public static void main(String[] args) {
        System.out.println("I want to print the value of i but want to break when i=5");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of " + i);
            if (i == 5) {
                break;
            }

        }
        System.out.println("End");
    }
}
