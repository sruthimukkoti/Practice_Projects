package java_projects;

public class program22 {
	public static void main(String[] args)
	{
		//print unique numbers from an array
		int[] a= {1,2,3,3,4,4,4,5,5,5,5,6,7,7,8,9};
		int count=1;
		//int duplicate=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				continue;
				//duplicate++;
			else
				System.out.println(a[i]);
				count++;
		}
		//System.out.println(duplicate);
	}

}
