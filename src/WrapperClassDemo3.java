
public class WrapperClassDemo3 
{

	public static void main(String[] args) 
	{
		String requiredAirmiles = "5000";
		int miles = Integer.parseInt(requiredAirmiles);
		int availableAirMiles = 4000;
		if(availableAirMiles>=miles)
		{
			System.out.println("Book the ticket");
		}
		else
		{
			System.out.println("Airmiles is in-sufficient");
		}

	}

}
