package Practice;

public class FibonicSeries {

	public static void main(String[] args)
	{ 
		int a=0;//1,1,2
	    int b=1;//1,2,3
        for(int i=0;i<=10;i++)
        {
        	int c=a+b;//1,2,3,5
        	System.out.println(c);
        	a=b;
        	b=c;
        }
	}

}
