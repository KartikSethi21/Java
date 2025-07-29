
// 1st  Employee
class Employee1 {
    int id;
    String name; // by default null
    int salary;

    // Methods
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        // name=n;
        this.name = n;
    }

}

class CellPhone {
    public void ring() {
        System.out.println("Ringing");
    }

    public void vibrate() {
        System.out.println("Vibrating");
    }

    public void callFriend() {
        System.out.println("Calling");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

}

class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}

public class CH_34_OOP_QUES {
    public static void main(String[] args) {

        // Problem 1
        Employee1 kartik = new Employee1();
        kartik.setName("Kartik Won ");
        kartik.salary = 500;
        System.out.println(kartik.getName());
        System.out.println(kartik.getSalary());

        System.out.println();
        // Problem 2
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.vibrate();
        asus.callFriend();

        System.out.println();

        // Problem 3
        Square squ = new Square();
        squ.side = 3;
        System.out.println(squ.area());
        System.out.println(squ.perimeter());

        System.out.println();

        // Problem 4
        Rectangle rect = new Rectangle();
        rect.length = 6;
        rect.breadth = 4;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());

        System.out.println();

    }

}
