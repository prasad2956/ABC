package InterrfaceDemo;

public class BankTest2 
{

	public static void main(String[] args) 
	{
		Bank b1 = new USBank();
		b1.totalCustomers();
		b1.totalBalance();
		 
		Bank b2 = new UKBank();
		b2.totalCustomers();
		b2.totalBalance();
		
		Bank b3 = new CanadaBank();
		b3.totalCustomers();
		b3.totalBalance();

	}

}
