package Java_programs;

import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("TS", "Hyd");
		hm.put("AP", "TPT");
		hm.put("KRL", "TRVNT");
		Set<String> keys=hm.keySet();
		for(String key : keys) {
			System.out.println(key+"->"+hm.get(key));
		}
		if(hm.containsKey("TS"))
		{
			System.out.println("Contains value "+hm.get("TS"));
		}
		
	}

}
