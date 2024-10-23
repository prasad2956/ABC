package exceptionDemo1;

public class VoterDetails5 
{

	public static void main(String[] args) 
	{
		

	}
	public static void voterAgevalidation(int age)throws Exception
	{
		if(age>=18)
		{
			System.out.println("validvoter");
		}
		else	
		{
		System.out.println("age is not valid vote");
		throw new VoterAgeException();
	//	throw new Exception("age is not validvote");
		}
	System.out.println("continue");
	}
}
