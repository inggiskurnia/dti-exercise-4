import java.util.Scanner;

public class SwapCase {
    public static void swap(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some words : ");
        String words = myObj.nextLine();
        StringBuilder swapped = new StringBuilder();

        for (int i=0; i<words.length(); i++){
            if (Character.isLowerCase(words.charAt(i))){
                swapped.append(Character.toUpperCase(words.charAt(i)));
            } else {
                swapped.append(Character.toLowerCase(words.charAt(i)));
            }
        }
        System.out.println("The swapped words are : " + swapped);
    }
}
