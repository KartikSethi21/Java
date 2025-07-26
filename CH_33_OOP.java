// in one java file only 1 public file can be there
class Employee{
    int id;
    String name;
    int salary;
    public static void main(String[] args) {

    }
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }

    public int getSalary(){
        return salary;
    }
}



public class CH_33_OOP {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        // Instantiating a new Employee Object
        Employee kartik = new Employee();
        Employee john = new Employee();

        // Setting properties/attributes
        kartik.id = 12;
        kartik.name = "Kartik Will Become The Best Coder";
        kartik.salary=50;
        
        john.id = 17;
        john.name= "John Khandelwal";
        john.salary=48;

        // getting properties/attributes
        System.out.println(kartik.id);
        System.out.println(kartik.name);

        // Better way
        kartik.printDetails();
        john.printDetails();

        // Get salary of Employees
        System.out.println("Kartik Salary is "+kartik.getSalary());
        System.out.println("John Salary is "+john.getSalary());

    }
}

