public class CH_23_BREAK_CONTINUE {
    public static void main(String[] args) {
        System.out.println("Break and continue");

        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println(" JAVA is great");

            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.err.println("Loop Ended");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
                // everything below continue for thecondition will be ignored
            }
            System.out.print(i);
            System.out.println(" JAVA is great");

        }
        System.err.println("Loop Ended");

        // for(int i=0;i<12;i++){
        //     for(int j=0;i<5;j++){
        //         System.err.print(i+" ");
        //         System.err.println(j);
        //         if(j==3){
        //             break;
        //         }
        //     }
        //     System.out.printf("Out of %d loop\n",i);
        // }
    }
    
    
    
    
}
