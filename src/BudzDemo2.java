
public class BudzDemo2 
{
	public static void main(String[] args) 
	{
	  int grosssalary = 100000;
	  BudzDemo2 bd1 = new  BudzDemo2();
	  int netSalary = grosssalary - bd1.houseCharges(); 
      System.out.println(netSalary);
	}
    
	int houseCharges()
	{
		int rent = 10000;
		int childfee = 20000;
		int totalCharges = rent + childfee;
		System.out.println(totalCharges);
		return totalCharges;
	}

}
