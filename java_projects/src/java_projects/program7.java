package java_projects;
import java.util.*;
import java.io.*;
public class program7 {
	//reverse of a number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		sc.close();
		int rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
