public class CH_13_String_Method {
    public static void main(String[] args) {
        String st = new String("Kartik");
        String st1 = "Kartik";
        System.out.println(st1);
        // Methods of String
        //returning a new string 
        // st1 = "";

        // No change in original string
        // even if we make change it will only chamge the reference 
        // -> example st1 = st1.toLowerCase();
        // st1 will now point to this new string
        // i.e change in reference



        // First length()
        int a = st1.length();
        System.out.println("Length is "+a);

        // Second toLowerCase()
        String lower_str = st1.toLowerCase();
        System.out.println("String in Lower Case is "+lower_str);

        // Third toLowerCase()
        String upper_str = st1.toUpperCase();
        System.out.println("String in Upper Case is "+upper_str);
        
        // Fourth trim()
        String nonTrimmedString = " ka la lss   ldl   ";
        String newStr = nonTrimmedString.trim();
        System.out.println("Trimmed String is "+newStr+" sp");

        // Fifth substring(start_index) 
        // -> from start_index to end
        System.out.println(st.substring(2));
        System.out.println(st.substring(0));

        // substring(start_index,end_index) 
        // -> end_index excluded
        System.out.println(nonTrimmedString.substring(4,9));

        // Sixth replace
        System.out.println(st.replace('t', 'p')); //only a copy
        System.out.println("Original "+st);

        
        System.out.println(st.replace("tik", "plk"));
        System.out.println(st.replace("t", "plk"));

        // Seventh startsWith()
        System.out.println(st.startsWith("Kar"));

        // Eighth endsWith()
        System.out.println(st.endsWith("iki"));

        // Ninth chatAt()
        System.out.println(st.charAt(4));

        // Tenth indexOf()
        System.out.println(st.indexOf("K"));
        System.out.println(st.indexOf("ik"));
        // with starting index that is start finding from here
        String modified = "Karrtirrkk";
        System.out.println(modified.indexOf("rr",4));

        // Elevnth lastIndexOf -> return last index of given string
        System.out.println(modified.lastIndexOf("rr"));
        // from starting to 4th index search within this
        System.out.println(modified.lastIndexOf("rr",4));

        // Twelfth equals -> compare to string
        System.out.println(st.equals("Kartik"));

        // Thirteen equalsIgnoreCase -> compare to string with ignoring the case sensitivity
        System.out.println(st.equalsIgnoreCase("kartiK"));


        // Escape Sequence Characters
        //  \n -> new line
        //  \t -> new tab
        //  \' -> Single quote
        //  \\ -> backlash




    }
    
}
