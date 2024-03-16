package BasicsOfJava.w3resources;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args){
        long binary1, binary2;
        int remainder = 0;
        int[] sum = new int[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Binary Number: ");
        binary1 = input.nextLong();
        System.out.println("Enter second Binary Number: ");
        binary2 = input.nextLong();
        int i = 0;
        while(binary1 != 0 || binary2 != 0){
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 /10;
            binary2 = binary2 / 10;
        }
        if(remainder != 0){
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two Binary Number:" );
        while(i >= 0){
            System.out.print(sum[i--]);
        }
    }
}
