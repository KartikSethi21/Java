public class CH_08_operators {
    public static void main(String[] args){
        // 1 Arithmetic operators +, - , * , / , %
        int a = 7;
        int b= 6 + a;
        System.out.println(b);
        b = b-2;
        // 2 Assignment Operator = , += , -=
        // b-=9; 
        System.out.println(b);
        b = b*2;
        System.out.println(b);
        b = b/4;
        System.out.println(b);

        // Module % works on float and double too
        b= 27%2;
        System.out.println(b);
        System.out.println(4.8 % 1.1);

        // 3  Comparison Operator
        int com=90;
        System.out.println(com == 90);
        System.out.println(com <= 80);
        System.out.println(com >= 30);

        //4 Logical Operators

        // And Operator
        System.out.println(67 >= 30 && 67<=20);

        // Or Operator
        System.out.println(67 >= com || 67<= com);

        // Not Operator
        System.out.println(com != 50);

        // 5 Bitwise Operator
        System.out.println(10 & 11);
        System.out.println(2&3);





    }
    
}
