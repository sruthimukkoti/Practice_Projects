package java_projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program14 {
//swap two words

public class StringSwapExample {

public static void main(String[] args) {

// Take two string s1 and s2 which we need to swap.
String s1 = "Rahul";
String s2 = "Shetty";

// Combine both the strings s1 and s2 using the concatenation(+) operator
s1 = s1 + s2;

// Use the substring method to get the subset of the combined string
s2 = s1.substring(0, s1.length() - s2.length());
s1 = s1.substring(s2.length());

System.out.println("s1 =" + s1);
System.out.println("s2 =" + s2);

}

}
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\saisruthi.mukkoti\\eclipse-workspace\\java_projects\\src\\java_projects\\read.txt");
		BufferedReader reader=new BufferedReader(fr);
		String str=reader.readLine();
		reader.close();
		String[] s= str.split(" ");
		String s1;
		s1=s[0]+s[1];
		String a = s1.substring((s1.length()-1)-s[0].length(), s1.length());
		String b= s1.substring(0, ((s1.length()-1)-a.length())+1);
		System.out.print(a);
		System.out.print(" "+b);
		
	}
	
	}

