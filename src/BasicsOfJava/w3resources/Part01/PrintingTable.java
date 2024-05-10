package BasicsOfJava.w3resources.Part01;
import java.util.Scanner;

public class PrintingTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int numInputted = input.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(numInputted +"X" + i + "=" +numInputted * i);
            i++;
        }
        input.close();
    }
}
