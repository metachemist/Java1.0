package BasicsOfJava.w3resources;
import java.util.*;

public class Operators {
    public static void main(String[] args){
//  create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
//  prompt the user to input the first number
        System.out.print("Input first number: ");
//  read and store the first number
        int num1 = input.nextInt();
//  for second number
        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        long avg = (num1+num2)/2;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println((25.5 * 3.5 - 3.5 * 3.5)/(40.5-4.5));
        System.out.println(STR."The average of \{num1} and \{num2} is \{avg}");



    }
}
