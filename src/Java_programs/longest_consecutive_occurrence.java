package Java_programs;

public class longest_consecutive_occurrence {

	public static void main(String[] args) {
		int[] a= {1,3,4,2,4,5,6,7};
		int count=0,max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1]) {
				count++;
			}
			else
				count=0;
			max=Math.max(max, count);
		}
		if(max>0)
			System.out.println("consecutive numbers "+(max+1));
		else
			System.out.println("No consecutive numbers");
	}

}
