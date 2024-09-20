 
public class WrapperClassDemo4A 
{

	public static void main(String[] args) 
	{
		String ticketCharges = "$5,000";
		String s = ticketCharges.replace("$","");
		String s1 = s.replace(",","");
		int miles = Integer.parseInt(s1);
		int availableBalance = 4000+1000;		
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
