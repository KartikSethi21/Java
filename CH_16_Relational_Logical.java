public class CH_16_Relational_Logical {
    public static void main(String[] args) {
        // Relational Operator
        //  == , >= , <= , > , < , !=

        // Logical Operator
        // && -> AND  (Logical AND) ~  L -> R precedence
        // || -> OR   (Logical OR)
        // ! -> NOT   (Logical NOT)

        boolean a= true, b =false,c =true;

        if( a && b && c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        } 
        
        
        if( a || b || c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("NOT of a is "+ !a);
        System.out.println("NOT of b is "+ !b);

    }
    
}
