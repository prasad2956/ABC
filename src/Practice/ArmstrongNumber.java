package Practice;

public class ArmstrongNumber 
{
	/*Armstrong number is a number that is equal to sum of its own digits .each digit raised
      to the power of the number of digits*/

	public static void main(String[] args) 
	{
		int n = 153;
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum = sum+(rem*rem*rem);
			n=n/10;

		}
		if(temp == sum)
		{
			System.out.println("it is armstrong");
		}
		else
		{
			System.out.println("it is not armstrong");
		}

	}


}
