import java.util.Scanner;

public class CH_17_SWITCH {
    public static void main(String[] args) {
        // else if

        int age;
        System.out.println("Enter your Age ");
        Scanner sc =new Scanner(System.in);
        age =sc.nextInt();

        if(age > 56){
            System.out.println("You are experienced !");
        }else if( age >46){
            System.out.println("You are semi experienced");
        }else if(age > 36){
            System.out.println("You are semi semi experienced");
        }else{
            System.out.println("You are in-experienced");
        }

        if(age>2){
            System.out.println("You are not a baby ");
        }
        
        
        // Switch case
        
        int ab =age;

        switch (ab) {
            case 18:
                System.out.println("You are going to become an Adult..");
                break;
            case 23:
                System.out.println("You are going to join a job..");
                break;
            case 68:
                System.out.println("You are goint to get retired");
                break; 
            default:
                System.out.println("Ram bharose");
        }

        // Enhanced Switch

        String var = "Kartik";

        switch (var) {
            case "Jatin" ->{
                System.out.println("bhai kamal kar diya");
                System.out.println("bhai kamal kar diya");
                System.out.println("bhai kamal kar diya");
                System.out.println("bhai kamal kar diya");
            }
            case "Kartik" -> {
                System.out.println("Savari chali gurugaon");
                System.out.println("Savari chali gurugaon");
                System.out.println("Savari chali gurugaon");
            }
            case "NoName" -> System.out.println("Bajenge Bajenge");

            default -> System.out.println("Kya hi hoga tumhara");
        }
    }
    
}
