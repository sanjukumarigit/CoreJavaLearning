package src.basics_04;

public class Lab_062
{
    public static void main(String[] args) {
        //jdk13 -only available
        int itemcode=002;
        switch (itemcode){
        case 001,002,003:
        System.out.println("its an electronic gadget");
        break;

            case 004,006:
                System.out.println("its an mechanical gadget");
                break;
            case 007:
                System.out.println("its an software gadget");
                break;
        }
    }
}
