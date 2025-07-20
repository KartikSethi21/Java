import java.util.Scanner;

public class CH_06_Input{
    public static void main(String args[]){
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        
        int a =sc.nextInt();
        System.out.println(a);
        float ab = sc.nextFloat();
        // Check if number is float


        System.out.println("Enter number 2");
        // int b = sc.nextInt();
        float bc = sc.nextFloat();
        // int sum = a+b;
        float sum =ab + bc;
        System.out.println("The sum of these number is"); 
        System.out.println(sum);   
        
        
        // Take value and check whether literal is int or not
        // Used to check validity of liternal
        boolean ab1 = sc.hasNextInt();
        System.out.println(ab1);

        // Taking String Value
        // String str =sc.next();//next only take a word
        // System.out.println(str);

        String str1 =sc.nextLine();//nextLine take full string
        System.out.println(str1);
        sc.close();
        
    }
}