package src.OOPS_07.OOPS_07;

public class Lab_131
{
    public static void main(String[] args) {
        String name = "Pramod";
        System.out.println(name.concat(" Dutta"));
        System.out.println(name + " Dutta");
        System.out.println(name.contains("a"));
        System.out.println(name);


        String name2 = new String("Dutta");
        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }
    }
}
