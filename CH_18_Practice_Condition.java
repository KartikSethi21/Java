import java.util.Scanner;

public class CH_18_Practice_Condition {
    public static void main(String[] args) {
        // Pracrice 1
        int a =10;
        if(a==11){//a=11
            System.out.println("a ia 11");
        }else{
            System.out.println("Not 11");
        }

        // Practice 2
        // Student pass with 40% total and 33% in each subject to pass
        // 3 subjects
        float subj1,subj2,subj3;
        Scanner sc=  new Scanner(System.in);
        
        System.out.println("Marks of Subject 1");
        subj1=sc.nextFloat();

        System.out.println("Marks of Subject 2");
        subj2=sc.nextFloat();

        System.out.println("Marks of Subject 3");
        subj3=sc.nextFloat();

        float total= ((subj1 +subj2 +subj3)/300)*100;
        float pass1, pass2, pass3;
        if(total > 40 && (subj1 > 33 && subj2 > 33 && subj3 > 33)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        // Practice 3
        // Calculate income tax paid by an employee to the government as per the slab mentioned
        // 2.5L - 5.0L tax 5%
        // 5.0L - 10.0L tax 20%
        // Above 10.0L tax 30%
        // Below 2.5 no tax


        float tax = 0;
        float income;
        System.out.println("Enter income");
        income = sc.nextFloat();
        if(income<=250000){
            tax =tax+0;
        }
        else if(income > 250000 && income <= 500000){
            tax = tax + 0.05f * (500000 - 250000);
        }
        else if (income > 500000 && income <=1000000){
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (income - 500000);
        }
        else if (income > 1000000){
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (income - 1000000);
        }
        System.out.println("Total tax paid by Employee is "+ tax);

        // Practice 4
        // Find out the day of the week given the number
        // 1 for  Monday and 2 for Tuesday


        System.out.println("Enter the number between 1 to 7");
        int day;
        day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a Valid Number");
        }

        // Practice 5
        // Tell whether a year entered by user ia a leap year or not

        int Year;
        System.out.println("Enter a year ");
        Year = sc.nextInt();
        if( ( Year % 4 ==0 && Year %100 !=0 )|| Year % 400 ==0 ){
            System.out.println(Year +" is a Leap Year");
        }else{
            System.out.println(Year +" is not a leap year");
        }

        // Practice 6
        // Type of website
        // .com -> Commercial website
        // .org -> Organization website
        // .in -> Indian website
        
        String str;
        System.out.println("Enter the weblink ");
        str = sc.next();

        if(str.endsWith(".org")){
            System.out.println("This is an Organizational website");
        }else if(str.endsWith(".com")){
            System.out.println("This is an commercial website");
        }else if(str.endsWith(".in")){
            System.out.println("This is an indian website");
        }

        sc.close();
    }

    
}
