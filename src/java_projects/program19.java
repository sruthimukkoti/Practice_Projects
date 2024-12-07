package java_projects;

public class program19 {

	public static void main(String[] args) {
		String s="MY self ShruthiII";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				c++;
		}
		System.out.println(c);
	}

}
