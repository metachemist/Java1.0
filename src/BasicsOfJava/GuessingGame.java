package BasicsOfJava;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        int numSelected = 65;
        System.out.print("\nHi there amigos, let's get started!\nRule of Game You only should enter number between 1-100 \nEnter your guessed number: ");
        Scanner scan = new Scanner(System.in);
        int numInputted = scan.nextInt();
//        System.out.println(numInputted);
        if(numInputted>0 && numInputted<100){
            if(numInputted == numSelected){
                System.out.println("voilà! You guessed correct number");
            } else if (numInputted < numSelected) {
                System.out.println("Ouch! your guessed number is less than the actual selected number");
            }else {
                System.out.println("Oops, you guessed a greater number than the selected one");
            }
        }else{
            System.out.println("your entered number is against the game rule.");
        }


    }
}
