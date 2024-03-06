package src.OOPS_07.OOPS_07;

public class Lab_132
{
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = new String("Pramod");
        String s3 = new String("pramod");
        System.out.println(s1 == s2);//stored at memory location
        System.out.println(s1.equals(s2)); //store at object and refer to the content


        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
