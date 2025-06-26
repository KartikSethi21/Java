public class CH_20_LOOP {
    public static void main(String[] args) {
        int n=1;
        while (n<10) {
            System.out.println(n);
            n++;
        }

        
        // while(1){} -> will only take boolean value no int value like in c++

        System.out.println("Star Pattern ");
        // Star Pattern
        int i=1;
        while(i<=5){
            int j=1;
            while (j<5) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }

    }    
}
