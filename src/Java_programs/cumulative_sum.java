package Java_programs;

public class cumulative_sum {

	public static void main(String[] args) {
		int a[]= {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum=sum+a[j];
				if(sum==0)
					System.out.println("Sub array found from "+i+" to "+j); 
			}
		}

	}

}
