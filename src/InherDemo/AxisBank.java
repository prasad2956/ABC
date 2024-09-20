package InherDemo;

public class AxisBank extends RBIBank
{
   int ccLimit = 50000;
   AxisBank()
   {
	   System.out.println("cons of AxisBank");
   }
   void personalLoan()
   {
	   System.out.println("personalLoan of AxisBank");
   }
   void cBillScore()
   {
	   System.out.println("cBillScore of AxisBank is 600");
   }
}
