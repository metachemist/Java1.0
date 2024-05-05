package BasicsOfJava.w3resources.Part01;

import java.util.Scanner;

import static java.lang.Math.*;

public class Computation {
    public static void main(String[] args){
        long side;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of side: ");
        side = input.nextLong();
        double area = (6*pow(side,2))/(4*tan(PI/6));
        System.out.println(STR."The area of hexagon is: \{area}");
    }
}



