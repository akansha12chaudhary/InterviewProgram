package oops;

interface customerA
{
	int amount=5; //public + Static + Final
	void purchase(); //public + Abstract
}
class seller implements customerA
{

	@Override
	public void purchase() 
	{

		System.out.println("I need "+amount+"kg of Rice");
	}
	
}
public class Abstraction_Interface {
	public static void main(String[] args) 
	{
		customerA a=new seller();
		a.purchase();
	}

}
