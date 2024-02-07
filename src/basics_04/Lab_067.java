package src.basics_04;

public class Lab_067
{
    public static void main(String[] args) {
        char code='B';
        int val=switch (code)
                {
                    case 'A':
                        yield 65;
                    case 'B':
                        yield 85;
                    default:
                        throw new IllegalStateException("Unexpected value "+ 78);
                };
        System.out.println(val);

    }
}
