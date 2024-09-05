import java.util.Scanner;

public class RandomGuess {
    public static void startGuess(){

        //generate random number 1-100
        int random = (int) (Math.random() * 100);

        //guess number
        Scanner myObj = new Scanner(System.in);
        boolean start = true;
        int maxTry = 2;
        int tryCount = 0;

        while(start){
            System.out.println("Guess some number : ");
            int guess = myObj.nextInt();

            if (tryCount == maxTry) {
                System.out.println("The random number is : " + random);
                start = false;
            }

            if (guess > random) {
                System.out.println("Too high");
                tryCount += 1;
            } else if (guess < random) {
                System.out.println("Too low");
                tryCount += 1;
            } else {
                System.out.println("You guess the correct number");
            }
        }
    }
}
