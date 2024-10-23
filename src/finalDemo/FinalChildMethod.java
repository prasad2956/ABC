package finalDemo;

public class FinalChildMethod extends FinalParentMethod
{

	public static void main(String[] args) 
	{
		FinalChildMethod f1 = new FinalChildMethod();
		f1.cBillScore();
	}
   public void cBillScore()
   {
	   System.out.println("cBillScore of FinalChildMethod is 650");
   }
}
