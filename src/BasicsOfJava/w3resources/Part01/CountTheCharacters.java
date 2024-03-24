package BasicsOfJava.w3resources;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheCharacters {
    public static void main(String[] args){
        System.out.println("Enter Any string: ");
        Scanner input = new Scanner(System.in);
        char[] test01 = input.nextLine().toCharArray();
        count(Arrays.toString(test01));

    }
    public static void count(String test01){
        char[] ch = test01.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < test01.length(); i++){
            if (Character.isLetter(ch[i])){
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println(STR."The String is : \{test01}");
        System.out.println(STR."Letter: \{letter}");
        System.out.println(STR."Space: \{space}");
        System.out.println(STR."Number: \{num}");
        System.out.println(STR."Other Characters: \{other}");
    }
}
