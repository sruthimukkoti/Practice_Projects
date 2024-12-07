package Java_programs;

public class zeros_to_right {

	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 0, 3, 0, 0, 0 };
		int j=a.length-1,temp=0;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]==0) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j--;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}

}
