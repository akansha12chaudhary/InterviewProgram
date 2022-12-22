package oops;

public class Encapsulate 
{
private String studentName;
private int studentRollno;
private int studentAge;

public int getAge()
{
	return studentAge;
	
}
public String getName()
{
	return studentName;
	
}
public int getRollno()
{
	return studentRollno;
}


public void setAge(int newAge)
{
	studentAge=newAge;
}

public void setName(String newName)
{
	 studentName=newName;
	
}

public void setRollno(int newRollno)
{
	studentRollno=newRollno;
}

public static void main(String[] args) 
{
	Encapsulate e=new Encapsulate();
	
	e.setName("Akansha Chaudhary");
	e.setRollno(12);
	e.setAge(24);
	
	System.out.println("Name of the Student is "+e.getName());
	System.out.println("Roll Number of the Student is "+e.getRollno());
	System.out.println("Age of the Student is "+e.getAge());
	
}
}
