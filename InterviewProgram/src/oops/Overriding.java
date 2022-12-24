package oops;
class Super
{
	public void display1()
	{
		System.out.println("Super Display");
	}
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("Sub Display");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Sub s=new Sub();
		s.display();
		s.display1();
	}

}
