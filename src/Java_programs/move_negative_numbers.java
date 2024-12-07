package Java_programs;

public class move_negative_numbers {

	public static void main(String[] args) {
		int a[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int j=0,temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
		}
		}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
	}

}
}
