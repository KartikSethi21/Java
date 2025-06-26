import java.util.Scanner;

public class CH_22_FOR_LOOP {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("first 10 natural numbers");
        // first n odd numbers in for loop
        for(int i=0;i<=10;i++){
            System.out.println(2*i+1);
        }

        System.err.println("Reverse loop");
        for(int i=7;i>0;i--){
            System.out.println(i);
        }

        for(int i=2;i!=0;i--){
            System.out.println("Kartik");
        }


        // Even :- 2n -0, 2, 4, 6
        // Odd :- 2n+1 - 1, 3, 5, 7 

        // First n natural number in reverse order
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i!=0;i--){
            System.out.println(i);
        }
        sc.close();
    }
    
}
