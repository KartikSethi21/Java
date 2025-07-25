public class CH_01_MESSAGE {
    
    public static void main(String[] args){
        message();
        System.out.println("During return call 5");

    }
    static void message(){
        System.out.println("Hello World 1!");
        message1();
        System.out.println("During return call 4");
    }

    static void message1(){
        System.out.println("Hello World 2");
        message2();
        System.out.println("During return call 3");
    }

    static void message2(){
        System.out.println("Hello World 3");
        message3();
        System.out.println("During return call 2");
    }

    static void message3(){
        System.out.println("Hello World 4");
        message4();
        System.out.println("During return call 1");
    }

    static void message4(){
        System.out.println("Hello World 5");
    }
    
}
