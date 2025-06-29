public class CH_25_Arrays {
    public static void main(String[] args) {
        // Classroom of 500 students - Store marks of 500 students
        
        //  Array
        //  Three main ways to create an array
        //  First way
        //  Declaration and memory allocation and later initialize
        int [] marks = new int[5];
        //  Second way
        int [] ages;         // Declaration 
        ages = new int[4];   // Memory allocation and later initialize
        //  Third way
        //  Declaration and initialization -> memory allocation automatic by java
        int [] height = {121,134,155,189,177}; 

    // type array varname = new type[size]
        
        System.out.println("Address of marks array "+marks);

    //    Size is 5*4 = 20 bytes

        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 10;
        marks[3] = 70;
        marks[4] = 100;
        marks[4] = 90;//can overrite value
        // marks[5] = 100; // will give error
        

    }
    
}
