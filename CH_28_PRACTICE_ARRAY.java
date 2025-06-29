import java.util.Scanner;

public class CH_28_PRACTICE_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Practice Problem 1
        // Create an array of 5 floats and calculate their sum

        float[] arr = new float[5];
        float sum = 0;

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }

        // for(float it:arr){
        // System.out.println(it);
        // sum+=it;
        // }

        System.out.println("Sum of all numbers is " + sum);

        // Practice Problem 2
        // WAP to find wheather given number is in the array or not

        float[] parr = { 1.60f, 21.5f, 46.5f, 51.8f, 72.9f };

        float num = 21.5f;
        boolean isFound = false;

        for (float it : parr) {
            if (it == num) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Element in the array");
        } else {
            System.out.println("Element not in the array");
        }

        // Practice Problem 3
        // Calculate the avg marks from an array containing marks of all students in
        // physics using for loop

        float[] marks = { 66.5f, 77.5f, 44.5f, 33, 23.5f };
        sum = 0;

        for (float ele : marks) {
            sum += ele;
        }

        System.out.println("Average of physics marks is " + sum / marks.length);

        // Practice Problem 4
        // WAP to add 2 matrices of size 2X3

        int[][] mat1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] mat2 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] result = {
                { 0, 0, 0 },
                { 0, 0, 0 }
        };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d \n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing elements of 2D array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");

        }

        // Practice Problem 5
        // WAP to reverse an array

        int[] memo = { 22, 33, 1, 65, 78, 99, 90, 12 };
        System.out.println("Before");
        for (int it : memo) {
            System.out.println(it);
        }

        Math.floorDiv(5, 2);
        // 5/2 -> 2.5-> 2 lower value
        int l = memo.length;
        int n = Math.floorDiv(l, 2);// mid of array
        int temp;

        // Swapping
        for (int i = 0; i < n; i++) {
            temp = memo[i];
            memo[i] = memo[l - i - 1];
            memo[l - i - 1] = temp;
        }
        System.out.println("Before");

        for (int it : memo) {
            System.out.println(it);
        }

        // Practice Problem 6
        // WAP to find maximum in an array

        int[] maxed = { 99, 102, 88, 21, 1, 67, 23 };

        int maxi = Integer.MIN_VALUE;

        for (int it : maxed) {
            if (it > maxi) {
                maxi = it;
            }
        }
        System.out.println("Maximun value in array is " + maxi);

        // Practice Problem 7
        // WAP to find minimum in an array

        int[] mined = { 99, 102, 88, 21, 1, 67, 23 };

        int mini = Integer.MAX_VALUE;

        for (int it : mined) {
            if (it < mini) {
                mini = it;
            }
        }
        System.out.println("Minimum value in array is " + mini);

        // Practice Problem 8
        // WAP to check wheather array is sorted or not

        int[] sie = { 1, 2, 33, 44, 65, 87 };
        boolean isSorted = true;
        for (int i = 0; i < sie.length - 1; i++) {
            if (sie[i] > sie[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }

        sc.close();
    }
}
