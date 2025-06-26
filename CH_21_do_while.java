public class CH_21_do_while {
    public static void main(String[] args) {
        int a=0;
        while(a<5){
            System.err.println(a);
            a++;
        }
        System.out.println(a);
        // Why use do while loop
        // run the loop without checking the condition
        a=45;// -> if we do this it will run an infinite loop for a>5 as all value will be >5 for a=45
        do{
            System.err.println(a);
            a++;

        }while(a<5);
        System.out.println("First n natural number");

        // first n natural number
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<10);
    }
}
