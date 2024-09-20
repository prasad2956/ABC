
public class ArraysDemo4 
{

	public static void main(String[] args) 
	{
		Ramesh r = new Ramesh();
		Ramesh a[] = new Ramesh[5];
		a[0] = new Ramesh();
		System.out.println(a[0]);
		a[1] = r;
		System.out.println(a[1]);
		a[2] = null;
		System.out.println(a[2]);
		a[3] = new Ramesh();
		System.out.println(a[3]);
		a[4] = r;
		System.out.println(a[4]);
		

	}

}
