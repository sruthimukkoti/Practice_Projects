package Java_programs;

public class consecutive_ones {
	public static void main(String[] args) {
		int[] a = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1,1 };
		int count=1,max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1])
				count++;
				else
					count=1;
			max=Math.max(max, count);
			}
		System.out.println(max);
		}
	}

