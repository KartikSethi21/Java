class Employees {
    private int id;
    private String name;

    // get invoked automatically
    public Employees(){
        id = 45;
        name="Your name here";
    }

    public Employees(String myName){
        id =15;
        this.name = myName;
    }

    public Employees(String myName,int id){
        this.id =id;
        this.name = myName;
    }

    public String getName() {// getter
        return name;
    }

    public void setName(String n) {// setter
        // name = n;
        // same ->
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

}

public class CH_36_CONSTRUCTORS {
    public static void main(String[] args) {
        Employees emp = new Employees();
        // emp.setId(12);
        // emp.setName("Kartik");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        Employees emp1 = new Employees("Programming with Kartik");
        // emp.setId(12);
        // emp.setName("Kartik");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        Employees emp2 = new Employees("Fun with Kartik",12);
        // emp.setId(12);
        // emp.setName("Kartik");
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());

    }

}
