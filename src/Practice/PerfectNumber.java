 package Practice;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		int n =28;
		int sum = 0;
		for(int i= 1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
        if(sum==n)
        {
        	System.out.println("perfectNumber");
        }
        else
        {
        	System.out.println(" Not perfectNumber");
        }
	}

}
