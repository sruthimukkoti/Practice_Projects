package java_projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program14 {
//swap two words
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

