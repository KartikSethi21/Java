import java.util.Random;
import java.util.Scanner;

public class CH_19_ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        Random rand =new Random();

        int randint = rand.nextInt();//Any Integer
        int randomIntBound = rand.nextInt(100); //0 to 100
        double randDouble = rand.nextDouble();//0.0 to 1.0
        boolean randomBoolean = rand.nextBoolean(); //true or false

        System.out.println("Int: "+randint);
        System.out.println("Bounded Int: "+randomIntBound);
        System.out.println("Double: "+randDouble);
        System.out.println("Boolean: "+randomBoolean);

        // Using Math.random()
        double random = Math.random(); //0.0 <= random < 1.0
        int randomInt = (int)(Math.random()*100); //0 to 100

        System.out.println("Random double: "+random);
        System.out.println("Random int(0-99) "+randomInt);

        // Rock paper scissor b/t user and comp
        int randomFromComp = rand.nextInt(3);
        System.out.println("Enter rock paper or scissor");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int numberFromUser = -1;
        if(str.equals("rock")){
            numberFromUser =0;
        }else if(str.equals( "paper")){
            numberFromUser = 1;
        }else if(str.equals("scissor")){
            numberFromUser = 2;
        }else{
            System.out.println("Wrong Input");
        }

        String[] choices = {"rock","paper","scissor"};
        System.out.println("Computer chose: "+choices[randomFromComp]);

        
        if(randomFromComp == numberFromUser){
            System.out.println("Draw");
        }else if(
            (numberFromUser == 0 && randomFromComp ==2)||//rock beats scissor
            (numberFromUser == 1 && randomFromComp ==0)||//paper beats rock
            (numberFromUser == 2 && randomFromComp ==1)//scissor beats paper
        ){
            System.out.println("You win and Comp Looses");
        }else{
            System.out.println("You Loose and Comp Wins!");
        }


        sc.close();
    }
    
}
