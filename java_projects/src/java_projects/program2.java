package java_projects;

import java.util.ArrayList;
import java.util.Scanner;

public class program2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("enter values in array");
		for(int i=0;i<10;i++)
			a[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<10;i++)
			System.out.print(a[i]+",");
		System.out.println();
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(!(b.contains(a[i])))
			{
				b.add(a[i]);
				count++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						count++;
				}
				System.out.println("Occurence of"+a[i]+" "+count);
			}
			if(count==1)
				System.out.println("unique number"+a[i]);
		}
		System.out.println(b);
	}
		
}



