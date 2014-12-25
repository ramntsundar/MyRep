package Test01Mar2014;

public class car {

	String mod;
	int price;
	public car (String m, int p)
	{
		mod = m;
		price = p;
		System.out.println(mod);
		System.out.println(price);
	}
	public car()
	{
		System.out.println("No parameters");
	}
}
