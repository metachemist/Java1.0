package BasicsOfJava.Patterns;

public class rotatedHalfPyramid {
    public static void main(String[] args){
        int n=4;
//        for (int i=1; i<=n; i++){
//            // inner loop --> print space
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //inner loop --> print star
//            for (int j=1; j<=i; j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
