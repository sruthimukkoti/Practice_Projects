package java_projects;
import java.util.*;
public class program9 {
	//Fibonacci
	public static void main(String[] args)
	{
		int n,i=0,first=0,second=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		sc.close();
		while(i<n)
		{
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
			i++;
		}
		
	}

}
