package InherDemo;

public class ObjectClassArrayDemo1 
{

	public static void main(String[] args) 
	{
		Object orr[]=new Object[6];
		orr[0] = new Object();
		orr[1] = new RBIBank();
		orr[2] = new HDFCBank();
		orr[3] = "RBG technologies";
		orr[4] = 10;
		orr[5] = true;

	}

}
