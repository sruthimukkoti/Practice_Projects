package Java_programs;

import java.util.Arrays;
import java.util.*;

public class anagrams {

	public static void main(String[] args) {
		String[] str= {"ANT","ACT","LLAB","CAT","DOG","GOD","BALL","TAC"};
		HashMap<String, List> hm=new HashMap<String,List>();
		for(int i=0;i<str.length;i++) {
			char[] c=str[i].toCharArray();
			Arrays.sort(c);
			String mapword=new String(c);
			if(hm.containsKey(mapword))
			{
				hm.get(mapword).add(str[i]);
			}
			else {
				List<String> ls=new ArrayList<String>();
				ls.add(str[i]);
				hm.put(mapword, ls);
			}
			
		}
		for(String s:hm.keySet()) {
			List<String> values=hm.get(s);
			if(values.size()>1)
				System.out.println(values);
		}
		
	}

}
