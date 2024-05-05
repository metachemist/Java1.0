package BasicsOfJava;
import java.util.*;
public class TestClass {
    public static void main(String[] args){
        /*long Bigone = 299999999L, Largeone = 39999999999L;
        int miles = 90,
                furlong = 98,
                yards = 45,
                feet = 22;
        System.out.println(miles);
        System.out.println(furlong);
        System.out.println(yards);
        System.out.println(feet);
        System.out.println(Bigone + "and" + Largeone);

        //Testing escape sequence character
        System.out.println("Testing Escape Sequence\n");
        System.out.println("Testing Escape Sequence\t");
        System.out.println("Testing Escape Sequence\b");
        System.out.println("Testing Escape \rSequence\r");
        //System.out.println("Testing Escape Sequence\a");
        System.out.println("Testing Escape Sequence\"");
        System.out.println("Testing Escape Sequence\\"); */


        /*char symbol;
        symbol = (char) (128.0*Math.random());
        if (symbol >= 'A'){
            if (symbol <= 'Z'){
                System.out.println("You have capital letter");
            }else {
                if (symbol >= 'a'){
                    if (symbol <= 'z'){
                        System.out.println("you have the small letter");
                    }else{
                        System.out.println("The code is greater than a and its not a letter");
                    }
                }else {
                    System.out.println("The code is less than and its not a letter");
                }
            }
        }else{
            System.out.println("The code is less than A so its not a letter");
        }
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to compare: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1>0 & num2>0){
            System.out.println("not good");
        }
        System.out.println("bye bye");*/
        long limit = 20;
        long factorial;

        for (int i = 1; i <= limit; i++){
            factorial = 1;
            for (int factor = 2; factor <= i; factor++){
                factorial *= factor;
            }
            //System.out.println(STR."\{i}! is \{factorial}");
            System.out.println(factorial);
        }
    }
}


