public class Types_Post_Pre {
    public static void main(String[] args) {
        float a = 65.6f + 9;
        System.out.println(a);

        // Increment and decrement operator
        System.out.println("Increment");

        int i=78;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int b=i++;// first b is assigned i then i is incremented
        System.out.println(b); 
        System.out.println(i);

        System.out.println("Decrement");
        int gf=90;
        System.out.println(gf--);
        System.out.println(gf);
        System.out.println(--gf);
        System.out.println(gf);
        int ab=89;
        int jh= ab--;
        System.out.println(jh);
        System.out.println(ab);

        char ch ='a';
        System.out.println(ch++);
        System.out.println(ch);
        System.out.println(++ch);
        
    }
    
}


/* 
 b -> byte , f ->float , s ->short , d -> double , i -> integer , 
 c -> character , l -> long
 
 r= b + s -> int
 r= b + i -> int
 r= l + f -> float
 r= i + f -> float
 r= c + i -> int
 r= c + s -> int
 r= l + d -> double
 r= f + d -> double
*/ 