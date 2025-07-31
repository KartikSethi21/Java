
class EkClass {
    int a;

    EkClass(int a) {
        // a=a; //error
        this.a = a;
    }

    public int getA() {
        int one = this.returnOne();
        System.out.println(one);
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        // as EkClass doest does not have defalt contructor called explicitly
        // so without super it will give error
        super(c);
        int a=super.getA();
        System.out.println("Inside DoClass "+ a);
        System.out.println("I am a contructor");

    }
}

public class CH_40_THIS_SUPER {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
        DoClass d = new DoClass(65);
    }
}

// super  can be used to refer immediate parent class intance variable
// can be used to invoke parent class methods
// can be used to invoke parent class contructors
