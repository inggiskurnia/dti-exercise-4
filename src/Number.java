import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Number {
    public static void printNumber(){

        //Create list of unknown length
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        String confirm = "";
        boolean start = true;

        while(start) {
            System.out.println("Input some number : ");
            numbers.add(myObj.nextInt());
            System.out.println("Press y to continue");
            System.out.println("Press n to stop");
            myObj.nextLine();
            confirm = myObj.nextLine().toLowerCase();

            if(confirm.charAt(0) == 'n'){
                start = false;
                System.out.println(numbers);
            }
        }
    }
}
