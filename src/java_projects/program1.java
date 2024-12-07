package java_projects;

public class program1 {

	public static void main(String[] args)
	{
		int n=1212111,sum=0,rem,count=0;
		while(n!=0)
		{
	    rem=n%10;
	    sum=sum+rem;
	    n=n/10;
	    count++;
		}
		System.out.println("sum="+sum);
		System.out.println("number of digits in a number"+count);
	}
}
