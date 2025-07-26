import java.util.Scanner;

public class CH_32_2_RECURSION {
    static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }

    }

    static void multiplicationTableRecursion(int n, int i) {
        if (i == 11)
            return;
        System.out.println(n * i);
        multiplicationTableRecursion(n, i + 1);
    }

    static int FibonacciNumber(int n) {
        if (n == 0 || n == 1)
            return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    static int FibonacciNumber(int n, int n1, int n2, int sum) {
        if (n == 0)
            return n1;
        sum = n2 + n1;
        return FibonacciNumber(n - 1, n2, sum, sum);
    }

    static int fibNumber(int n) {
        // if(n==1) return 0;
        // if(n==2) return 1;
        if (n == 1 || n == 2)
            return n - 1;
        return fibNumber(n - 1) + fibNumber(n - 2);
    }

    static void printFibanacci(int n, int n1, int n2) {
        if (n == 0)
            return;
        System.out.println(n1);
        printFibanacci(n - 1, n2, n1 + n2);
    }

    static void FibbonaciSeries(int n) {
        printFibanacci(n, 0, 1);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    static void patternRec(int n) {
        // if n>0 print * n times
        if (n > 0) {
            patternRec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int natutalSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // n*(n+1)/2
    static int natutalSumRecursion(int n, int sum) {
        if (n == 0)
            return sum;
        return natutalSumRecursion(n - 1, sum + n);
    }
    // sum(n) = 1+2+3+...+n
    // sum(n) = 1+2+3+...+n-1+n
    // sum(n) = sum(n-1)+n

    static int natutalSumRecursion2(int n) {
        if (n == 1)
            return 1;
        return n + natutalSumRecursion2(n - 1);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void patternRec2(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println("");
            patternRec2(n - 1);
        }
    }

    static int average(int... arr) {
        int sum = 0;
        for (int it : arr) {
            sum += it;
        }
        return sum;
    }

    static void convert(float n) {
        double c = (n * 1.8) + 32;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Multiplication
        System.out.println("Enter value of n for table multiplcation");
        int n = sc.nextInt();
        System.out.println("Table of " + n + " is ");
        multiplicationTable(n);
        multiplicationTableRecursion(n, 1);

        // Fibonacci at a index
        int ans = FibonacciNumber(4, 0, 1, 0);
        System.out.println(ans);
        int ans1 = FibonacciNumber(4);
        System.out.println(ans1);
        // nth fibonacci number

        int fibNumber = fibNumber(4);
        System.out.println(fibNumber);

        FibbonaciSeries(10);
        int fiboNumber =fibNumber(4);
        System.out.println("Number is "+fiboNumber);

        // Print pattern
        pattern(4);

        // Sum of first n natural number
        int numbSum = natutalSum(10);
        System.out.println(numbSum);
        int numbSum2 = natutalSumRecursion(10, 0);
        System.out.println(numbSum2);
        int numbSum3 = natutalSumRecursion2(10);
        System.out.println(numbSum3);

        // Print Pattern2
        pattern2(4);

        // find average of a set of numbers passed as arguments
        average(1, 2, 3, 4, 5, 6, 7, 7);

        // pattern using recursion
        patternRec(4);

        patternRec2(4);

        // celcius to farenheit
        convert(10);

        sc.close();

    }

}
