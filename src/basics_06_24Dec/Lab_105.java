package src.basics_06_24Dec;

import java.util.Scanner;

public class Lab_105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] marks =new float[4];

        System.out.println("Enter the first subject mark");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the second subject mark");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the third subject mark");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the fourth subject mark");
        marks[3]=sc.nextFloat();

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<30){
                System.out.println("You are fail in this subject " +marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();



    }
}
