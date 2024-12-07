package java_projects;

public class program16 {
	//sorting array
	public static void main(String[] args)
	{
		int[] a= { 9,4,5,6,7,8 };
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}