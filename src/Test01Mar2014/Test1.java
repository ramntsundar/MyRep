package Test01Mar2014;

public class Test1 {

	public static void main(String[] args) 
	{
		System.out.println(sumAll(12,15)); 
		
		System.out.println(findSum(10));
		//System.out.println(sumten(5));
		
		

	}

	
	public static int sumAll(int a, int b)
	{
		return a+b;
	}
	
	public int sumten(int num)
	{
		return num;
	}
	
	public static int findSum(int num)
	{
		int x=0;
		for (int i=0;i<=num;i++)
		{
			x = i + x;
		}
		return x;
	}
}
