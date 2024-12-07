package java_projects;

import java.util.HashMap;
import java.util.Set;

public class program17 {
//duplicate characters in a string/unique characters 
	public static void main(String[] args) {
		String str="SaiSruthi";
		char[] c=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:c) {
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		System.out.println(hm);
		Set<Character> keys=hm.keySet();
		for(char ch:keys)
		{
			if(hm.get(ch)==1) //if(hm.get(ch)>1)
				System.out.println(ch+"->"+hm.get(ch));
		}
		
	}

}
