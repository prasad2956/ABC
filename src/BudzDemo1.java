
public class BudzDemo1 
{

	public static void main(String[] args) 
	{
	  int grosssalary = 100000;
	  int netSalary = grosssalary - totalCharges; 
      System.out.println(netSalary);
	}
    
	void  houseCharges()
	{
		int rent = 10000;
		int childfee = 20000;
		int totalCharges = rent + childfee;
		System.out.println(totalCharges);
	}
}
