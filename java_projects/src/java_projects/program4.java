package java_projects;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter Second number");
		int b=sc.nextInt();
		sc.close();
		System.out.println("before swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" "+b);
	}

}
