package oops;
import java.lang.*;
import java.util.*;

class Parent {
 public void print_Father()
 {
     System.out.println("ABC Singh");

}
}

class Child extends Parent
{
 public void print_child() 
     { 
	 System.out.println("Bella");
	 }
}

public class Inheritance {
 public static void main(String[] args)
 {
     Child c = new Child();
     c.print_Father();
     c.print_child();
 
 }
}
