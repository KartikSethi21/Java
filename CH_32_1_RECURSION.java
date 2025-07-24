
public class CH_32_1_RECURSION {

    static int factorial(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }
    
    static int factorialRecursion1(int n){
        if(n==0 || n==1) return 1;
        return n *factorialRecursion1(n-1);
    }

    static int factorialRecursion(int n,int fact){

        if(n==0 || n==1) return fact;
        fact = fact * n;
        return factorialRecursion(n-1,fact);
    }
    public static void main(String[] args){
        System.out.println("Factorial of 5 is "+factorial(5));
        System.out.println("Factorial of 5 is "+factorialRecursion1(5));
        System.out.println("Factorial of 5 is "+factorialRecursion(5,1));
        
    }    
}
