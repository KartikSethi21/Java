class Employee {
    private int id;
    private String name;

    public String getName() {//getter
        return name;
    }

    public void setName(String n){//setter
        // name = n;
        // same ->
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i){
        id = i;
    }

}

public class CH_35_ACCESS_MODIFIERS {
    public static void main(String[] args) {
        Employee kar = new Employee();
        // Private can not access
        // will throw an error due to private access modifier

        // kar.id=12;
        // kar.name = "KArtik";

        kar.setId(12);
        kar.setName("Kartik");
        System.out.println(kar.getId());
        System.out.println(kar.getName());

    }

}
