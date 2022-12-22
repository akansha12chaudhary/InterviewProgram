package oops;
import java.lang.*;
import java.util.*;

public class Rectangle
{
	private double length;
	private double breadth;
	
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	
	public void setLength(double l)
	{
		length=l;
	}
	public void setBreadth(double b)
	{
		breadth=b;
	}
	
	
	public double area()
	{
		return length* breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}


public static void main(String[] args) 
{
	Rectangle r=new Rectangle();

	r.setLength(33);
	r.setBreadth(44);
	
	System.out.println("Area of Rectangle is "+r.area());
	System.out.println("Perimeter of Rectangle is "+r.perimeter());
	System.out.println("Length of Rectangle is "+r.getLength());
	System.out.println("Breadth of Reactangle is "+r.getBreadth());
	
	
}	
	
}
