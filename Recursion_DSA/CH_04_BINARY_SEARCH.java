public class CH_04_BINARY_SEARCH {


    // F(n) => O(1) + F(n/2)
    // T.C ~ O(logn)
    // S.C ~ O(logn)
    static int binarySearchRec(int [] arr,int n,int s, int e,int target){
        if(s>e || n==0) return -1;

        int mid = s+(e-s)/2;

        if(arr[mid] == target) return mid;

        if(arr[mid] > target){
            e=mid-1;
        }else{
            s=mid+1;
        }
        return binarySearchRec(arr,n,s,e,target);
    }

// make sure return the function with a return type in function
// same

    static int binarySearchRec2(int [] arr,int n,int s, int e,int target){
        if(s>e || n==0) return -1;

        int mid = s+(e-s)/2;

        if(arr[mid] == target) return mid;

        if(arr[mid] > target){
        return binarySearchRec(arr,n,s,mid-1,target);
        }
        
        return binarySearchRec(arr,n,mid+1,e,target);
        
        
    }

    static int binarySearch(int[] arr, int target){
        int ans=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid  = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int [] arr ={11,22,44,54,76,87,90};
        int n = arr.length;
        int index = binarySearchRec(arr,n,0,n-1,76);
        System.out.println(index);
        index = binarySearch(arr,76);
        System.out.println(index);
        
    }
    
}



// Types of recurence relation
// 1 Linear recurence relation -> Fibo -> repated function calls
// Dynamic programming is memorization 
// -> if in a recurssion call 2 or more recurssion call are doing the same work dont do it again

// 2 Divide and conquer  recurence relation -> binary search

