package oops;

public class Overloading 
{
	public int add(int x,int y)
	{
		return(x+y);
	}
	
	public int add(int x,int y,int z)
	{
		return(x+y+z);
		
	}
	public double add(double x,double y)
	{
		return(x+y);
		
	}
	public static void main(String[] args) 
	{
	
		Overloading o=new Overloading();
		System.out.println(o.add(10, 15));
		System.out.println(o.add(5, 6, 9));
		System.out.println(o.add(11.2,6.8));
		
	}

}
