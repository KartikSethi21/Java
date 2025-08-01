class Phone{
    public void showTime(){
        System.out.println("Time is 8pm");;
    }

    public void On(){
        System.out.println("Turning on Phone");;
    }
}

class SmartPhone extends Phone{
    
    public void music(){
        System.out.println("Aapka Swaagat Hai !!!");
    }

    @Override
    public void On(){
        System.out.println("Turning on SmartPhone");
    }
}


public class CH_42_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args){

        // Phone obj = new Phone();
        // SmartPhone smObj = new SmartPhone();
        // obj.name();

        // What about this =>
        Phone phObj = new SmartPhone();
        //Reference is of Super class
        // Object is Of Sub class

        phObj.showTime();
        phObj.On();
        // phObj.music(); error


        // error =>
        // SmartPhone smObj = new Phone();

    }
    
}

// Dynamic method dispatch =>

// Runtime Polymorphism use this
// Object creation on runtime
// When we write new it is creating object on runtime

// Super => meth1 , meth2
// Sub => meth2(override) , meth3

// Super obj = new Sub();
// obj.meth2() => allowed will call of sub 
// obj.meth3() => not allowed error

// Sub obj = new Super(); => not allowed

