


// Create a class Circle and use Inheritance to create another class cylinder from it

class Circle1{
    public int radius;

    Circle1(){
        System.out.println("I am a non param of circle ");
    }

    Circle1(int radius){
        System.out.println("I am Circle's Parameterized Constructor");
        this.radius = radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;

    Cylinder1(int radius ,int height){
        super(radius);

        System.out.println("I am Cylinder1's Parameterized Constructor");
        this.height = height;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class CH_44_INHERITANCE_QUES {
    public static void main(String[] args) {
        // Circle1 objC = new Circle1(12);
        Cylinder1 obj = new Cylinder1(12,4);

        
    }
    
}
