class Base1{
    public int x;

    Base1(){
        System.out.println("Hi I am a constructor of base");
    }

    Base1(int x){
        System.out.println("Hi I am an overloaded constructor of base with x as "+ x);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void printMe(){
        System.out.println("Hi ");
    }
}


class Derived1 extends Base1{
    public int y;
    
    Derived1(){ 
        // how to call overload contructor of Parent class
        // super(0);

        // by default it will run the constructor of parent class of without arguments
        System.out.println("Hi I am a constructor of derived");
    }

    Derived1(int x,int y){
        super(x);
        System.out.println("Ia m an overloaded contructor of Derived class with value of y as "+y);
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

}


class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a contructor of ChildOfDerived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded contructor of ChildOfDerived class with z as "+z);
    }
}

public class CH_39_INHERITANCE_AND_CONSTRUCTORS {
        public static void main(String[] args) {

            // Base1 bs = new Base1();

            // Child class object =>
            // will firstly call Parent class constructor then its own constructor

            // Derived1 dv = new Derived1();
            // Derived1 dv = new Derived1(4,9);

            // ChildOfDerived cd = new ChildOfDerived();
            ChildOfDerived cd = new ChildOfDerived(12,13,15);
            
        }
    
}
