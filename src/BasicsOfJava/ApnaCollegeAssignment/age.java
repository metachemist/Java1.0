package BasicsOfJava.ApnaCollegeAssignment;

import java.util.Scanner;

public class age {
    public static void voterAge(int age){
        if (age<18&&age>0)
            System.out.println("You are not eligible to vote");

        if (age>=18)
            System.out.println("You are eligible to vote");

        if (age<=0)
            System.out.println("Invalid age");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        voterAge(age);



    }
}
