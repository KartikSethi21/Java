
class A {
    public int a;

    public int kartik() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    // method overriding =>
    // @Override => it is a override notation
    // if no ovverriding but notation is present it will give error

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }

}

public class CH_41_METHOD_OVERRIDING {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}

// Method overloading multiple methods in same class with same name but
// different parameters

// Method overriding is class child will inherit everything of A but change this
// particular method

// In method Overiding the method should have a same return type or it should be sub type of that return type
// Access level should be same public => public can not be change to private
// final and static method can not be override