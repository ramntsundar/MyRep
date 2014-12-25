package Test01Mar2014;

public class testcase {
	

	public static void main(String[] args) 
	{
	
		char grade = 'C';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Case A");
			break;
		case 'B':
			System.out.println("Case B");
			break;
		case 'C':
			System.out.println("Case C");
			break;
		case 'D':
			System.out.println("Case D");
			break;
		default:
			System.out.println("Not valid grade");
		}
	
		System.out.println("The grade is " + grade);
	}

}
