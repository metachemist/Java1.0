package BasicsOfJava.ApnaCollegeAssignment;
import static java.lang.Math.PI;

import java.util.Scanner;

public class Circle {

    public static double circumferenceOfCircle(double radius){
        return ((2)*radius*PI);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextInt();
        double result = circumferenceOfCircle(radius);
        System.out.println("The Circumference of the circle is: " + result);

        input.close();
    }
}
