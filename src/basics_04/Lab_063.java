package src.basics_04;

public class Lab_063
{
    public static void main(String[] args) {
        int itemcode = 007;
        switch (itemcode) {
            case 001 -> System.out.println("Its a laptop");

            case 002 -> System.out.println("Its a desktop");

            case 003, 004 -> System.out.println("Its a mobile");

            default -> System.out.println("hello");

        }
    }
}
