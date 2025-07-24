public class CH_30_METHOD_OVERLOADING{

    //  static means that this method tellJoke will be shared with every object of the class it is in 
    // no need to make a class object explicitly to call the method in other methods

    static void tellJoke(){
        System.out.println("I invented a new word\n"+"Plagarism! ");

    }

    int sum(int a,int b){
        a++;
        b++;
        return a+b;
    }

     void Change(int[] a){
        a[2] = 20;
        
    }


    static void overloadin1(){
        System.out.println("Overloading No Parameters");
    }
    // static int overloadin1(){
    //     System.out.println("Overloading No Parameters");
    //     return 1;
    // }

    static void overloadin1(int a){
        System.out.println("Overloading 1 Parameter "+a);
    } 

    static void overloadin1(char a){
        System.out.println("Overloading 1 Parameter "+a);
    }

    static void overloadin1(String a){
        System.out.println("Overloading 1 Parameter "+a);
    } 

    static void overloadin1(String a,char b){
        System.out.println("Overloading 2 Parameter "+a+" "+b);
    }
    // Java doest not support default parameters

    // static void overloadin1(String a="Kartik",char b = "a"){
    //     System.out.println("Overloading 1 Parameter"+a);
    // }

    public static void main(String[] args) {
        tellJoke();
        CH_30_METHOD_OVERLOADING obj = new CH_30_METHOD_OVERLOADING();
        int a=4,b=5;
        int sum = obj.sum(a, b);
        System.out.println(sum+" "+a+" "+b);
        // value of a nd b will remain same
        //not in case of array as we pass its address -> pass by reference

        int [] age ={1,2,3,4};
        obj.Change(age);

        for(int it:age){
            System.out.println(it);
        }

        // Method overloading is methods having same name but different paraameters
        // Method overloading does not depend on return time -> will give error

        // Arguments are actual foo(a,b) => here a nd b are arguments
        // Parameters are static void foo(int a, in b) => here a and b are arguments

        overloadin1();
        overloadin1("Kartik");
        overloadin1('c');
        overloadin1("Kartik", 'S');
    }
}