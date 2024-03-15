package BasicsOfJava;

public class TestClass {
    public static void main(String[] args){
        long Bigone = 299999999L, Largeone = 39999999999L;
        int miles = 90,
                furlong = 98,
                yards = 45,
                feet = 22;
        System.out.println(miles);
        System.out.println(furlong);
        System.out.println(yards);
        System.out.println(feet);
        System.out.println(Bigone + "and" + Largeone);

        //Testing escape sequence character
        System.out.println("Testing Escape Sequence\n");
        System.out.println("Testing Escape Sequence\t");
        System.out.println("Testing Escape Sequence\b");
        System.out.println("Testing Escape \rSequence\r");
        //System.out.println("Testing Escape Sequence\a");
        System.out.println("Testing Escape Sequence\"");
        System.out.println("Testing Escape Sequence\\");

    }
}
