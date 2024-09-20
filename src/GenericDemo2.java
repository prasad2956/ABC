
public class GenericDemo2<T> 
{

	public static void main(String[] args) 
	{
		GenericDemo2<String> g1 = new GenericDemo2<String>();
		g1.funA("RBG technologies");
		GenericDemo2<Integer> g2 = new GenericDemo2<Integer>();
		g2.funA(10);
		GenericDemo2<Boolean> g3 = new GenericDemo2<Boolean>();
		g3.funA(true);
		GenericDemo2<A> g4 = new GenericDemo2<A>();
		g4.funA(new A());

	}
   void funA(T k1)
   {
	   System.out.println(k1);
   }
}
