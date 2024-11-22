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
		int j=3;
		while(j<=n)
		{
		int count=0;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
				count++;
		}
		if(count==0)
			System.out.println(j+" is prime");
		/*else
			System.out.println(j+" is not prime");*/
		j++;
		}
	}

}
