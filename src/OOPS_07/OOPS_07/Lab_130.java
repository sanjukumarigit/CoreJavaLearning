package src.OOPS_07.OOPS_07;

public class Lab_130
{
    public static void main(String[] args) {
        String name = "Pramod"; // String constant Pool
        String name2 = new String("Pramod"); // Heap area

        name = "Dutta";

        String str1 = "Hello";
        str1  = str1.concat("Pramod");
        System.out.println(str1);
    }
}


