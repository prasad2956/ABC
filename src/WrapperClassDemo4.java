
public class WrapperClassDemo4 
{

	public static void main(String[] args) 
	{
		String ticketCharges = "$5,000";		
		int miles = Integer.parseInt(ticketCharges);
		int availableBalance = 4000;		
		if(availableBalance>=miles)
		{
		System.out.println("Book the ticket");
		}
		else
		{
			System.out.println("available balance  is in-sufficient");
		}

	}

}
