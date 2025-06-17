public class CH_14_String_Practice {
    public static void main(String[] args) {
        // Problem 1 
        // Convert to lower case
        String name = "Kartik Sethi" ;
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        // replace Spaces with underscore
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        // replace name with Kartik
        String letter = "Dear <|name|> , thanks a lot!";
        letter = letter.replace("<|name|>", "Kartik");
        System.out.println(letter);

        
        // Problem 4
        // Detect double and triple spaces in a string
        String myString = "This string contains  double and   triple apces  ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5 
        // print String into a letter using escape sequence
        String myLetter = "Dear KArtik,\n\tThis is Jaba Course is finished.\nThanks";
        System.out.println(myLetter);

    }
    
}
