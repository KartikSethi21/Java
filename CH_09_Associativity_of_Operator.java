public class CH_09_Associativity_of_Operator {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        int b = 60/5-34*2;
        System.out.println(a);
        System.out.println(b);
        // Precedence and Associativity

        a=b=56; //firstly b=56 then a=b;

        int x=6,y=1;
        int k = x*y/2;
        System.out.println(k);

        b=1;
        a=5;
        int c=4;
        k= b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
    
}
