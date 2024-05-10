package BasicsOfJava.w3resources.Part01;
import java.util.*;

public class TakingInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num01 = input.nextInt();
        System.out.println("Enter second number: ");
        int num02 = input.nextInt();
        int result = num01*num02;
        System.out.println("The product of the numbers are " + result);

        input.close();
    }
}
