import java.util.Scanner;

public class CH_11_Practice {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // Practice 1
        float a =7/4* 9/2;
        // int/int = int 7/4 =>1
        System.out.println(a);
            float ab =7/4.0f* 9/2.0f;
        // int/int = int 7/4 =>1
        System.out.println(ab);

        // Practice 2
        // Grade encryption
        char grade = 'B';
        grade =(char) (grade+8);
        System.out.println(grade);
        // Decryption
        grade = (char)(grade - 8);
        System.out.println(grade);

        
        // Practice 3
        // Comparision

        int comp = sc.nextInt();
        System.out.println(comp>8);

        
        // Practice 4
        // Solve


        int v=6,u=5,h=2,g=3;
        int solve = ((v*v) - (u*u) )/(2*h*g);
        System.out.println(solve);

        
        // Practice 5
        // Solve

        int sa =7*49 + 35/7;
        System.out.println(sa);

    }
}
