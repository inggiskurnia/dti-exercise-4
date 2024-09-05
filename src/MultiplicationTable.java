import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static void findTable() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = myObj.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
