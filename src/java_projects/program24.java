package java_projects;

public class program24 {

	public static void main(String[] args) {
		String str="hello world"; //world hello
		String[] s=str.split(" ");
		//System.out.println(s.length);
		String temp="";
		/*for(int i=s.length-1; i>0;i--)
		{
		temp=s[i];
		s[i]=s[i-1];
		s[i-1]=temp;
		//System.out.println(s[i]);
		}
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		} */
		
		for(int i=0;i<s.length-1;i++)
		{
			temp=s[i];
			s[i]=s[i+1];
			s[i+1]=temp;
					
		}
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
	/*	for(int i=0;i<s.length-1;i++)
		{
		int n=s[i].length();
		for(int j=n-1;j>=0;j--)
		{
		System.out.print(s[i].charAt(j));
		}
*/
	}
	}


