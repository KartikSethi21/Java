import java.util.Scanner;

public class CH_24_PRACTICE {
    public static void main(String[] args) {
        
        // Practice 1
        // Star Pattern
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        // Practice 2
        // Sum first even n even numberd using while loop
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        n = sc.nextInt();
        int i=0,sum=0;
        while(i<n){
            sum = sum + i*2;
            i++;
        }
        System.out.printf("Sum of first %d numbers is %d\n",n,sum);

        //Practice 3
        // WAP to print multiplication table of a given number
        System.out.println("Enter the value for table");
        int multi=sc.nextInt();

        i=1;
        while (i<=10) {
            System.out.printf("%d X %d = %d \n",multi,i,multi*i );
            i++;
        }

        //Practice 4
        // WAP to print multiplication table of 10 in reverse order
        System.out.println("");
        int num =10;
        int ber =10;
        while(ber>=1){
            System.out.printf("%d X %d = %d \n",num,ber,num*ber );
            ber--;
        }
        
        //Practice 5
        // WAP to find factorial of a given number using for loop
        System.out.println("Enter the number for factorial");
        int no = sc.nextInt();
        int prod=1;
        for(i=no;i>=1;i--){
            prod =prod*i;
        }
        System.out.printf("Factorial of number %d is %d\n",no,prod);
        
        
        //Practice 6
        // WAP to find factorial of a given number using while loop
        prod=1;
        i=1;
        while (i<=no) {
            prod = prod*i;
            i++;
        }
        System.out.printf("Factorial of number %d is %d\n",no,prod);

        
        //Practice 7
        // WAP to calculate the sum of the numbers occuring in multiplocation table of 8

        sum=0;
        int nou =8;
        i=1;
        while(i<=10){
            sum = sum + nou*i;
            i++;
        }
        System.out.println("Sum is "+sum);




        sc.close();
    }
    
}
