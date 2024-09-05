import java.util.Scanner;

public class Pattern {
    public static void printPattern() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input iteration : ");
        int number = myObj.nextInt();

        for (int i=0; i<number; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
