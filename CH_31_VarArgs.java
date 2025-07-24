public class CH_31_VarArgs {

    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    // 
    static int sums(int ...arr){
        //int ...arr is  Available as int [] arr ;
        int result =0;
        for(int it:arr){
            result+=it;
        }
        return result;
    }
    // varargs with a compulsory argument that we have to pass x no matter what 
    static int sum1(int x,int ...arr){
        //int ...arr is  Available as int [] arr ;
        int result =0;
        for(int it:arr){
            result+=it;
        }
        return result;
    }

    public static void bar(int ...arr){
        int sum=0;
        for(int it:arr){
            sum+=it;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs");
        // To give a function more than 1 arguments is Varargs
        //
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 4 , 3 and 5 is "+sum(4,3,5));
        System.out.println("The sum of 2, 4 , 3 and 5 is "+sum(2,4,3,5));
        // Instead of doing this we can use ...arr
        System.out.println("The sum of 4 and 5 is "+sums(4,5));
        System.out.println("The sum of 4 , 3 and 5 is "+sums(4,3,5));
        System.out.println("The sum of 2, 4 , 3 and 5 is "+sums(2,4,3,5));
        
        System.out.println("The sum of 2, 4 , 3 and 5 is "+sums(1,2,4,3,5));

        // no value passed => gives zero
        System.out.println("The sum of nothing is "+sums());
        System.out.println("The sum of nothing is "+sums(1));

        // with one compulsory value as ...args can be empty
        System.out.println("The sum is "+sum1(1,3,4,5,5,7));

        bar();




    }

}
