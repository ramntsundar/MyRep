package Test01Mar2014;

public class Puppy {

	String Name;

	public void Puppy()
	{
		System.out.println("Without parameter");
	}
	
	
	public void Puppy(String name)
	{
		this.Name = name;
		System.out.println("My Name is " + this.Name);
	}
	

	public void setName(String empname)
	{
		this.Name = empname;
	}
	
	public String getName()
	{
		System.out.println("My Name is " + Name);
		return Name;
	}

	public static void main(String[] args) 
	{
		Puppy puppy = new Puppy();
		puppy.Puppy();
		puppy.Puppy("Ram");
		puppy.setName("Aishwarya");
		puppy.getName();
		
		System.out.println("The variable value is "+ puppy.Name);
	}
}