package Java_programs;

public class second_largest {

	public static void main(String[] args) {
		int[] a= {2,3,1,9,6,6,9};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]!=a[a.length-1]) {
				System.out.println(a[i]);
				break;
			}
			
				
		}
		
	}

}
