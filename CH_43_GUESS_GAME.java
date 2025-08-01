import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuessed(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        // sc.close();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;

        if(inputNumber == number){
            System.out.format("Yes you guess it right, it was %d\nYou guessed it in %d attempts ",number,noOfGuesses);
            return true;
        }else if(inputNumber<number){
            System.out.println("Too Low...");
        }else if(inputNumber>number){
            System.out.println("Too High...");
        }
        return false;
    }
}


public class CH_43_GUESS_GAME {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            // System.out.println(b);
        }
        
    }
}
