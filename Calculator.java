import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("Enter the Subjects Marks out of 100");
        Scanner ur = new Scanner(System.in);
        System.out.println("Enter First Subject Marks ");
        a = ur.nextInt();
        System.out.println("Enter Second Subject Marks ");
        b = ur.nextInt();
        System.out.println("Enter Third Subject Marks ");
        c = ur.nextInt();
        System.out.println("Enter Fourth Subject Marks ");
        d = ur.nextInt();
        System.out.println("Enter Fifth Subject Marks ");
        e = ur.nextInt();
        float percentage = ((a+b+c+d+e)/500.f)*100;
        System.out.print("Percentage is ");
        System.out.println(percentage);
    }
    
}


// Take 5 subjects marks and calculate percentage of them