package java_projects;

public class program11 {
	public static void main(String[] args)
	{
		pyramid();
		System.out.print("\n");
		pyramid1();
		System.out.print("\n");
		pyramid2();
		System.out.print("\n");
		pyramid3();
	}

	/* 1
	 * 1	2
	 * 1	2	3
	 * 1	2	3	4 */
static void pyramid()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			System.out.print("\t");
		}
		System.out.print("\n");
	}
}

/* 1
 * 2	3
 * 4	5	6
 * 7	8	9	10 */


public static void pyramid1()
{
	int k=1;
	for (int i=1;i<=4;i++)
	{	
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
			System.out.print("\t");
			k++;
		}
		System.out.print("\n");
	}
	
}

/* 10
 * 9	8
 * 7	6	5
 * 4	3	2	1
 */

public static void pyramid2()
{
	int k=10;
	for (int i=1;i<=4;i++)
	{	
		for(int j=1;j<=i;j++)
		{
			System.out.print(k);
			System.out.print("\t");
			k--;
		}
		System.out.print("\n");
	}
	
}
/* 1	2	3	4
 * 5	6	7
 * 8	9
 * 10
 */

public static void pyramid3()
{
	int k=1;
	for (int i=1;i<=4;i++)
	{	
		for(int j=0;j<=4-i;j++)
		{
			System.out.print(k);
			System.out.print("\t");
			k++;
		}
		System.out.print("\n");
	}
	
}


}

