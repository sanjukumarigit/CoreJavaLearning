package src.OOPS_07.OOPS_07;

public class Lab_136
{
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
