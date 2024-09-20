package InherDemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("cons of HDFCBank");
	}
	public static void main(String[] args) 
	{
//		RBIBank r1 = new RBIBank();
//		r1.cBillScore();
		HDFCBank h1 = new HDFCBank();
		h1.cBillScore();
	}
     void cBillScore()
     {
    	 System.out.println("cBillScore of HDFCBank is 700");
     }
}
