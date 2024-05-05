package BasicsOfJava.w3resources.Part01;

public class SwappingVariables {
    public static void main(String[] args){
        /*int num1 = 80;
        int num2 = 18;
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(STR."Before swap: Print num1\{num1} Print num2\{num2}");
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println(STR."After swap: Print num1\{num1} Print num2\{num2}");*/

                int num1 = 80;
                int num2 = 18;
                int temp;

                // Original swapping method using a temporary variable
                temp = num1;
                num1 = num2;
                num2 = temp;

                // Printing the values after swapping using the original method
                System.out.println(STR."Before swap: num1 = \{num1}, num2 = \{num2}");

                // New swapping method without using a temporary variable
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;

                // Printing the values after swapping using the new method
                System.out.println(STR."After swap: num1 = \{num1}, num2 = \{num2}");


    }


}
