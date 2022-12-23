package oops;
class A {
    public void first()
    {
        System.out.println("This ");
    }
}
 
class B extends A {
    public void second() { System.out.println("Is"); }
}
 
class C extends B {
    public void third()
    {
        System.out.println("Multi-Inheritance");
    }
}
 

public class Inheritance2 {
    public static void main(String[] args)
    {
       C g = new C();
        g.first();
        g.second();
        g.third();
    }
}