package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo1 
{

	public static void main(String[] args) 
	{
		Map map = new Hashtable();
		map.put("Name","RBG technologies");
		map.put("phonenum", 966666666);
		map.put(1, true);
		Map<String, String> map2 = new Hashtable<String, String>();
		map2.put("Name","RBG");
		Map<String,Integer> map3 = new Hashtable<String,Integer>();
		map3.put("phonenum",966666666);

	}

}
