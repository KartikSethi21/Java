import java.util.Scanner;

public class CH_12_Strings {
    public static void main(String[] args) {
        String st =new String("Kartik Sethi");
        System.out.println(st);
        String name = "New Job Start Kara Do ";
        System.out.println(name);
        // Strings are Immutable and cannot be Changed

        // Different print
        System.out.print("The name is : ");//no new  line after this
        System.out.println("The name is : ");//new  line after this
        int a=6;
        float b =  5.678f;
        float c =  5.678f;

        // printf is format specifier
        System.out.printf("The value of a is %d and the valus of b is %.2f and c is %8.2f ",a,b,c);
        System.out.format("The value of a is %d and the valus of b is %f",a,b);// same behaviour as printf

        System.out.println("\nTake Input String ---");
        Scanner sc = new Scanner(System.in);
        // String stri = sc.next(); // takes first wrod
        String stri = sc.nextLine(); 
        System.out.println(stri);
        sc.close();
    }
}


//  %d for int
//  %f for float
//  %c for char
//  %s for string