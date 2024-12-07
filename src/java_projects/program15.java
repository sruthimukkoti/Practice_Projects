package java_projects;

import java.util.Scanner;

public class program15 {
//Shifting all elements of an array back one in Java
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();} 
		//int[] a= {1,2,3,4,5};
		//int n=a.length;
		sc.close();
		/*int last=a[n-1];
		for(int i=n-1;i>0;i--) {
			a[i]=a[i-1];
		} 
		a[0]=last; */
		int first=a[0];
		//int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			//temp=0;
			a[i]=a[i+1];
		//	a[i+1]=temp;
		}
		a[n-1]=first;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
