public class CH_29_METHODS {
    int logic(int a, int b) {
        int sum;
        if (a >= b) {
            sum = a + b;
        } else {
            sum = (a + b) * 5;
        }
        return sum;
    }
    static int sum(int a, int b){
        int sum;
        if(a>=b){
        sum=a+b;
        }else{
            sum = (a+b)*5;
        }
        return sum;
    }
    
    static int binarySearch(int arr[], int target){
        int s=0,e= arr.length;
        int mid = s+ (e-s)/2;

        while(s<e){
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+ (e-s)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = sum(2, 6);
        System.out.println(result);

        result = sum(6, 2);
        System.out.println(result);
        
        result = sum(6, 6);
        System.out.println(result);

        // int arr[] = {1,2,3,4};
         //->will work just confusing as -> int arr[],b; ->one array or int [] arr1,arr2; -> 2 arrays
        int[] arr = {23,56,77,87,90,99,101};
        int target = binarySearch(arr,99);

        System.out.println(target);

        // Method invocation using object creation
        // for non static method we need to create its object
        CH_29_METHODS obj = new CH_29_METHODS();
        int c = obj.logic(9, 7);
        System.out.println(c);

        // possing value as -> pass by value => values will not change
        //  not in case of arrays
        
        
    }
    
}
