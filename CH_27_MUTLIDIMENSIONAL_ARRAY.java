public class CH_27_MUTLIDIMENSIONAL_ARRAY {
    public static void main(String[] args) {
            int[][] flats;
            flats = new int[2][3];
            flats[0][0] = 101;
            flats[0][1] = 102;
            flats[0][2] = 103;
            flats[1][0] = 201;
            flats[1][1] = 202;
            flats[1][2] = 203;

            // Printing a 2d array using for loop
            for(int i =0;i<flats.length;i++){
                for(int j=0;j<flats[i].length;j++){
                    System.out.print(flats[i][j]+" ");
                }
                System.out.println("");
            }

            // String[][][] str = new String[2][3][4];
            String[][] str = new String[2][4];
            str[0][0]="A";
            str[0][1]="B";
            str[0][2]="C";
            str[0][3]="D";
            str[1][0]="E";
            str[1][1]="F";
            str[1][2]="G";
            str[1][3]="H";

            for(int i=0;i<str.length;i++){
                for(int j=0;j<str[i].length;j++){
                    System.out.print(str[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
    }
    
    
}
