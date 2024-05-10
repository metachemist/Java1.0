package BasicsOfJava.ApnaCollegeAssignment;

import java.util.Scanner;

public class printSumNumbers {
    public static void printSumOfOddNumbers (int n){
        int sum = 0;
        if (n<0) {
            System.out.println("Negative integers are not allowed");
        }
        if (n==0){
            System.out.println("Zero?? seriously are you dumb?");
        }
        if (n > 0) {
            for (int i=1; i<=n; i++){
                if (i%2 != 0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum of odd numbers from 1 to "+ n +" is: "+ sum);
        }
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        input.close();

        printSumOfOddNumbers(n);

    }
}
