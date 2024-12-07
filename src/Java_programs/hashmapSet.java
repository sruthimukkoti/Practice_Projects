package Java_programs;

import java.util.*;
import java.util.Map.Entry;

public class hashmapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("TS", "Hyd");
		hm.put("AP", "TPT");
		hm.put("KRL", "TRVNT");
		//Set<Entry<String,String>> se=hm.entrySet();
		//Iterator<Entry<String,String>> it =se.iterator();
		Iterator<Entry<String,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			/*Entry<String,String> e=it.next();
			System.out.println(e.getKey()+"->"+e.getValue());*/
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey()+"->"+mp.getValue());
			
		}
	}

}
