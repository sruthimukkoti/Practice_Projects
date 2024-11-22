package java_projects;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		n=sc.nextInt();
		sc.close();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
			
	}

}
