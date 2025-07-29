
// Super class , Parent class or Base class
class Base{
    public int x;

    Base(){
        System.out.println("Hi I am a constructor of base");
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

// Sub class , Child class or Derived class
class Derived extends Base{
    public int y;
    
    Derived(){
        System.out.println("Hi I am a constructor of derived");
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

}

public class CH_38_INHERITANCE{
    public static void main(String[] args) {
        
        // Creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        System.out.println();

        // Creating an object of derived class
        Derived dev = new Derived();
        dev.setX(9);
        System.out.println(dev.getX());
        dev.setY(19);
        System.out.println(dev.getY());
        
    }
}