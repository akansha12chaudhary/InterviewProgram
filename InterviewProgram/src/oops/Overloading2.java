package oops;
public class Overloading2 
	{	 
	    public void StudentId(String name, int roll_no)
	    {
	            System.out.println("Name is " + name + " " + "Roll-No is " + roll_no);
	    }
	    
	    public void Studentid(int roll_no, String name)
	    {
	        System.out.println("Roll-No is " + roll_no + " " + "Name is  " + name);
	    }
	

	  public static void main(String[] args)
	    {
	       Overloading2 ov= new Overloading2();
	       ov.StudentId("Annie",1);
	       ov.Studentid(2,"Bella");
	      
	   
         }
	}
	

