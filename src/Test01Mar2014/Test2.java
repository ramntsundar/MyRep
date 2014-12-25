package Test01Mar2014;

public class Test2 {

	String mod;
	static int Wheels = 4;
	
	public static void main(String[] args) 
	{
		Test2 t2 = new Test2();
		t2.mod = "Maruthi";
		
		System.out.println(t2.mod);
		t2.acce();
		t2.start();
		
		System.out.println(Wheels);
	}
	
	
	public void start()
	{
		System.out.println(mod + "starting");
	}

	public void acce()
	{
		System.out.println(mod + "accelerating");
	}
}
