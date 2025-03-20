import java.util.Scanner;
import java.util.Random;

// create game class...
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    // create constructor of Game class...
    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    // create setter and getter...
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // create methods...
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        inputNumber = sc.nextInt();

        if (inputNumber == number) {
            sc.close();
        }
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("==================================");
            System.out.printf("Yes you guessed it right, it was %d\nYou guesses it in %d attemps!", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low ...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }

}

public class cwh_ch50_Ques_solve {
    public static void main(String[] args) {
        boolean b = false;
        Game g = new Game();
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}