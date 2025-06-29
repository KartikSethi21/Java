public class CH_26_LOOP_IN_ARRAY {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79 ,99, 80};
        // float [] marks = {98.5f, 45, 79.5f ,99, 80.5f};
        
        System.out.println("Printing using naive method");

        System.out.println(marks.length);
        System.out.println(marks[0]);

        String [] names = {"Kar","tik","Krish","an","Jat","in"};
        System.out.println(names[3]);
        System.out.println(names.length);
        
        // Getting elements using for loop
        System.out.println("Printing using loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Marks in reverse");
        for(int i =marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // For each Loop
        System.out.println("Using For each Loop");
        for(int it:marks){
            System.out.println(it);
        }
    }
    
    
}
