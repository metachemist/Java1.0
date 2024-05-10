package BasicsOfJava.ApnaCollegeAssignment;

import java.util.Scanner;

public class greaterNumber {
    public static double greaterNumberComparison(double num1, double num2){
        if (num1>num2){
            return num1;
        }
        else if(num1<num2){
            return num2;
        }
        else {
            return 0.0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double num1 = (double) input.nextLong();
        System.out.println("Enter 2nd number: ");
        double num2 = (double) input.nextLong();

        double result = greaterNumberComparison(num1, num2);
        System.out.println("The greater number is: " + result);

    }
}
