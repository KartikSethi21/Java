public class CH_03_FIBONACCI_NUMBER {

    
    // Fib(n) = Fib(n-1) + Fib(n-2); => Recurrence relation

    // Fib(5) => Fib(4) + Fib(3)
    // Fib(4) => Fib(3) + Fib(2)
    // Fib(3) => Fib(2) + Fib(1)
    // Fib(2) => Fib(1) + Fib(0)

    static int FibonacciNumber(int n){
        if(n==0 || n==1) return n;
        return FibonacciNumber(n-1) +FibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        
        int number = FibonacciNumber(5);
        System.out.println(number);
    }
    
}
