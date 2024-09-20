
public class ConsDemo12A 
{
   int a = 5;
   int b = 10;
   ConsDemo12A(int a, int b)
   {
	   this.a=a;
	   this.b=b;
   }
	public static void main(String[] args) 
	{
	System.out.println("main method start");
	ConsDemo12A c1 = new ConsDemo12A(20,30);
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println("Done");

	}

}
