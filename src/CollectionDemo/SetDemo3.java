package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 
{

	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		set.add("RBG technologies");
		set.add("Java");
		set.add("Selenium");
		Iterator<String> setlist = set.iterator();
		String data1 = setlist.next();
		System.out.println("data1: "+data1);
		String data2 = setlist.next();
		System.out.println("data2: "+data2);
		String data3 = setlist.next();
		System.out.println("data3: "+data3);
		String data4 = setlist.next();
		System.out.println("data4: "+data4);

	}

}
