
public class PolyDemo5 
{

	public static void main(String[] args) 
	{
		PolyDemo5 p1 = new PolyDemo5();
		p1.funA(20,30l);
		p1.funA(40l,50);

	}
   void funA(int a,long b)
   {
	   System.out.println("int long args of PolyDemo5");
   }
   void funA(long a,int b)
   {
	   System.out.println("long int args of PolyDemo5");
   }
}
