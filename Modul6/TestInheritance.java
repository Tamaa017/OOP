package Modul6;

public class TestInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.MessageA();
        b.MessageB();
        b.MessageA();
        c.MessageC();
        c.MessageB();
        c.MessageA();
    }
}
