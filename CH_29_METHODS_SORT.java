public class CH_29_METHODS_SORT {
    static void sort(int[] arr){
        for(int i=0;i< arr.length;i++){
            // int a =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]< arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,33,55,7,43};
        System.out.println("Before Sorting");
        for(int it: arr){
            System.out.println(it);
        }
        sort(arr);
        System.out.println("After Sorting");
        for(int it: arr){
            System.out.println(it);
        }

    }
    
}
