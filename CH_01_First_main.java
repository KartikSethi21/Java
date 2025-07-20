import java.util.Scanner;

public class CH_01_First_main {
    //main class name  should be same as file name
    //public so that we can access the file from anywhere
    //class is just name group of property and functions
    public static void main(String[] args){//psvm
        //this is the main function in java
        //main function is the entry point of java prgrm
        //public means to make it available as without it prgem will not run
        //static means we want to run this main function without creating an object of class First_main
        //void is return type of function
        //args arguments --command line arguments --at terminal
        //System.out.println(args[1]);
        System.out.println("Hello world");//sout
        System.out.println("My name is ");
        System.out.println(69);
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());//First sting/word only
        input.close();
    }
}
