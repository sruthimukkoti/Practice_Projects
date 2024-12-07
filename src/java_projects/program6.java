package java_projects;
import java.io.*;
import java.util.*;
public class program6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		sc.close();
		//int j=3;
		//while(j<=n)
		//{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==0)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
		//j++;
		//}
	}

}
