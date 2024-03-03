package BasicsOfJava;

import java.util.*;

/*public class GuessingGame {
    public static void main(String[] args) {
        int counter = 0;
        int numSelected = 65;
        System.out.print("\nHi there amigos, let's get started!\nRule of Game You only should enter number between 1-100 \nEnter your guessed number: ");
        Scanner scan = new Scanner(System.in);
        int numInputted = scan.nextInt();
//        System.out.println(numInputted);
       do{
           if(numInputted>0 && numInputted<100){
               if(numInputted == numSelected){
                   System.out.println("voilà! You guessed correct number");
               } else if (numInputted < numSelected) {
                   System.out.println("Ouch! your guessed number is less than the actual selected number");
               }else {
                   System.out.println("Oops, you guessed a greater number than the selected one");
               }
               counter++;

           }else {
               System.out.println("your entered number is against the game rule.");
           }
       }while(counter == 3);
    }
}*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100; // You can change this value to set the maximum number for guessing
        int randomNumber = random.nextInt(maxRange) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and " + maxRange + ". Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
