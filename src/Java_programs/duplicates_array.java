package Java_programs;
import java.util.*;

public class duplicates_array {

	public static void main(String[] args) {
		String str="My self Sruthi Sruthi  My My";
		String[] s=str.split(" ");
		List<String> ls=new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			int count=0;
			if(!(ls.contains(s[i])))
			{
				ls.add(s[i]);
				count++;
				for(int j=i+1;j<s.length;j++) {
					if(s[i].equals(s[j]))
						count++;
				}
			}
			if(count>1)
				System.out.println(s[i]+"->"+count);
		}
	}

}
