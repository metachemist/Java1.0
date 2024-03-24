package BasicsOfJava.w3resources;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args){
        int firstint, secondint;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any two Numbers: ");
        firstint = input.nextInt();
        secondint = input.nextInt();

        if (firstint == secondint){
            System.out.println(STR."\{firstint} == \{secondint}");
        }
        if (firstint < secondint){
            System.out.println(STR."\{firstint} < \{secondint}");
        }
        if (firstint > secondint){
            System.out.println(STR."\{firstint} > \{secondint}");
        }
        if (firstint <= secondint){
            System.out.println(STR."\{firstint} <= \{secondint}");
        }
        if (firstint >= secondint){
            System.out.println(STR."\{firstint} >= \{secondint}");
        }
        if (firstint != secondint){
            System.out.println(STR."\{firstint} != \{secondint}");
        }
    }

}
