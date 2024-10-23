package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 
{

	public static void main(String[] args) 
	{
	List<String> list1 = new ArrayList<String>();
	list1.add("RBG technologies");
	list1.add("Java");
	list1.add("Selenium");
	int totalElementCount = list1.size();
	System.out.println("totalElementCount :"+totalElementCount);
	list1.add("RBG technologies");
	list1.add("Java");
	list1.add("Selenium");
	list1.add("API testing");
	int totalElementCount1 = list1.size();
	System.out.println("totalElementCount1 :"+totalElementCount1);

	}

}
