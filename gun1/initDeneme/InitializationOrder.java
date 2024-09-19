package gun1.initDeneme;

public class InitializationOrder {
    static int i = 13;
    String name;
    static A a;

    public InitializationOrder() {
        this("InitializationOrder1");
        System.out.println("InitializationOrder()");
    }

    public InitializationOrder(String name) {
        this("InitializationOrder2", 5);
        System.out.println("in InitializationOrder(String name)");
    }

    public InitializationOrder(String name, int i) {
        this.name = name;
        System.out.println("in InitializationOrder(String name, int i)");
    }

    public static void main(String args[]) {
        System.out.println(A.Constant);
        System.out.println(B.constantex1);
        System.out.println(C.constante);


//		System.out.println("*****************************");
//		System.out.println("in main");
//		System.out.println("*****************************");
//		System.out.println(InitializationOrder.i);
//		System.out.println("*****************************");
//		InitializationOrder oi = new InitializationOrder();
//		System.out.println("*****************************");
//		new InitializationOrder();
//		System.out.println("*****************************");
//		new InitializationOrder();
//		System.out.println("*****************************");
//		new InitializationOrder();
//		System.out.println("*****************************");
//		B b = new B();
//		b.f();
    }

    C c = new C();

    static int[] ints = new int[10];
    static { // If static don't exists, it is not initialized as static
        System.out.println("Initializing the int array");
        for (int i = 0; i < ints.length; i++)
            ints[i] = i * 10;
    }

    boolean[] booleans = new boolean[10];
    { // If static don't exists, it is not initialized as static
        System.out.println("Initializing the boolean array");
        boolean b = false;
        for (int i = 0; i < booleans.length; i++)
            booleans[i] = !b;
    }

    public static final D d = new D();
}

class A {

    public A() {
        System.out.println("in A()");
    }

    C c = new C();
    static final int Constant= 5;
}

class B {
    static int constantex1=5;
    public B() {
        System.out.println("in B()");
    }

    public void f() {
        System.out.println("in f()");
    }
}

class C {
    static B b = new B();
    static int constante= 3;

    public C() {
        System.out.println("in C()");
    }

    static void g() {
        System.out.println("in g()");
    }
}

class D {
    static int i;

    static {
        i = 65;
        System.out.println("i: " + i);
    }

    public D() {
        System.out.println("in D()");
    }
}