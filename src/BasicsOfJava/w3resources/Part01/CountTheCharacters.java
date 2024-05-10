package BasicsOfJava.w3resources.Part01;

import java.util.Scanner;

public class CountTheCharacters {
    public static void main(String[] args) {
        System.out.println("Enter any string: ");
        Scanner input = new Scanner(System.in);
        String test01 = input.nextLine();
        input.close();
        count(test01);
    }

    public static void count(String test01) {
        char[] ch = test01.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < test01.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("The string is: " + test01);
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + num);
        System.out.println("Other Characters: " + other);
    }
}
