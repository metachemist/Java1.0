package BasicsOfJava.Patterns;
import java.util.*;

public class solidRectangle {
    public static void main(String[] args){
//        int i = 0;
//        while(i<=4){
//            System.out.println("*");
//            i++;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
