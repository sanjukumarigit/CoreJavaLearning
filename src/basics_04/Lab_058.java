package src.basics_04;

import java.util.Scanner;

public class Lab_058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character, i will tell you if its vowel or not \n");

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Its not a vowel");
                break;


        }
    }
}




