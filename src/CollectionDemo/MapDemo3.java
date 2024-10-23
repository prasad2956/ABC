package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo3 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new Hashtable<String,String>();	
		map.put("Name","RBG");
		System.out.println(map.get("Name"));
		map.put("Selenium","Java");
		System.out.println(map.get("Selenium"));
		map.put("API testing","PostMan");
		System.out.println(map.get("API testing"));

	}

}
