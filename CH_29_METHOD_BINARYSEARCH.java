public class CH_29_METHOD_BINARYSEARCH {
    static int squareRoot(int n) {
        int s = 0, e = n;
        int mid = s + (e - s) / 2, ans = -1;
        while (s <= e) {
            long squareroot = (long) mid * mid;
            if (squareroot == n) {
                return mid;
            } else if (squareroot > n) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    static double squareRootExact(int n) {
        int number = squareRoot(n);
        double ans = number;
        for (int i = 1; i < 3; i++) {
            double factor = 1 / Math.pow(10, i);
            for (double j = ans; j * j < n; j += factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int number = squareRoot(36);
        System.out.println(number);
        double square = squareRootExact(38);
        System.out.println(square);

    }

}
