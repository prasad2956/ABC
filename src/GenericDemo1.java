
public class GenericDemo1<G> 
{

	public static void main(String[] args) 
	{
		GenericDemo1 g1 = new GenericDemo1();
		g1.funA(10);
		g1.funA(true);
		g1.funA(new A());
		g1.funA("RBG technologies");

	}
	void funA(G k1)
	{
		System.out.println(k1);
	}
}
