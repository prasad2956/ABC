package exceptionDemo1;

public class VoterDetails3 
{

	public static void main(String[] args) 
	{
		voterAgeValidation(19);
		voterAgeValidation(18);
		voterAgeValidation(17);

	}
	public static void voterAgeValidation(int age)
	{
		if(age>=18)
		{
			System.out.println("validvoter");
		}
		else 
		{
			System.out.println("Age is not validvote");	
			throw new ArithmeticException();
		}
		System.out.println("continue-----");	
	}

}
