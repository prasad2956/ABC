package Practice;

public class PolidramDemo
{

	public static void main(String[] args)
	{
		int n = 121; 
		int b =n;
		int reverse = 0;
		while(n>0)
		{
			int rem = n%10;
			reverse = reverse*10+rem;
			n=n/10;
		}
		if(b==reverse)
		{
			System.out.println("it's a polindrom");
		}
		else
		{
			System.out.println("it's a not polindrom");
		}

	}

}
