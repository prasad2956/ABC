
public class BudzDemo4 
{

	public static void main(String[] args) 
	{
		int grosssalary = 100000;
		BudzDemo2 bd1 = new  BudzDemo2();
		int Charges = bd1.houseCharges();
		int netSalary = grosssalary - Charges;
		System.out.println(netSalary);
		int taxcal = 30*Charges;
		System.out.println(taxcal);
	}

	int houseCharges()
	{
		System.out.println("houseCharges is invoking");
		int rent = 10000;
		int childfee = 20000;
		int totalCharges = rent + childfee;
		System.out.println(totalCharges);
		return totalCharges;
	}

}
