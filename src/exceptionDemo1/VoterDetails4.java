package exceptionDemo1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class VoterDetails4
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
//			throw new ArithmeticException();
//			throw new NumberFormatException();
//			throw new NullPointerException();
//			throw new ArrayIndexOutOfBoundsException();
//			throw new IOException();
//			throw new SQLException();
//			throw new FileNotFoundException();
//			throw new Exception();
		}
		System.out.println("continue-----");	
	}

}
