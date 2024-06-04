package BasicsOfJava.Patterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //output
        System.out.println("Hello world with my college");
        System.out.print("Hello world\n");
        System.out.print("Hello world with java\nwith my college\n");
        // variables
        // String name = "tony stark";
        // int age = 48;
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
        //
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
 