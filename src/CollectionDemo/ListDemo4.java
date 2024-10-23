package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 
{

	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(10);
		list.add(true);
		list.add("RBG technologies");
		System.out.println(list.get(0));
		Object o1 = list.get(0);
		List<String> list1 = new ArrayList<String>();
		list1.add("RBG technologies");
		String s1 = list1.get(0);
		//		list1.get(0);       String functions
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		Integer i1 = list2.get(0);
		//list2.get(0);  Integer functions
		List<Boolean> list3 = new ArrayList<Boolean>();
		list3.add(true);
		Boolean b1 = list3.get(0);
		//list3.get(0);  Boolean functions
	}

}
