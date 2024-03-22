package BasicsOfJava.w3resources;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println(STR."Enter any string you want to reverse: ");
        char[] str1 = input.nextLine().toCharArray();
        System.out.println(STR."Reverse string: ");
        for (int i = str1.length - 1; i >= 0; i--){
            System.out.print(str1[i]);
        }
    }
}
