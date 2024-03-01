package BasicsOfJava;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        // do{
        System.out.print("\nHi there amigos, let's get started!\nRule of Game You only should enter number between 1-100 \nEnter your guessed number: ");
        int numInputted;
        Scanner scan = new Scanner(System.in);
        numInputted = scan.nextInt();
        System.out.println(numInputted);
        // }while();
        scan.close();
    }
}
