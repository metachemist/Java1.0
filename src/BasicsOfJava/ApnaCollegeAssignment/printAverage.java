package BasicsOfJava.ApnaCollegeAssignment;

import java.util.Scanner;

public class printAverage {
    public static void main(String[] ars){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        float average = (float) (num1 + num2 + num3) / 3;
        System.out.println("The Average of " + num1 + ", " + num2 + ", " + num3 +" is " + average) ;

    }
}
