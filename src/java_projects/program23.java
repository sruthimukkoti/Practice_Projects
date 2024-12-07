package java_projects;

public class program23 {
	public static void main(String[] args) {
		/* int[] arr = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		 int n = arr.length;
		 for (int i = 0; i < n; i++) {
             int prefix = 0;
             for (int j = i; j < n; j++) {
                 prefix += arr[j];
                 if (prefix == 0)
                    System.out.println("Subarray found from "+i+"to"+j);
             }
         }*/
		/*int[] a= {1,2,3,4,5,6}; //{2,1,4,3,6,5}
		int temp=0;
		System.out.println(a.length);
		for(int i=0;i<a.length-1;i=i+2) {
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);*/
		/*int[] a= {-1,9,-4,-5,6,8,-2}; //sorting array
		for(int i=0;i<a.length-1;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);*/
		String str="Rahul Shetty Academy is the best";//max word length and word
		String[] s=str.split(" ");
		//System.out.println(s);
		int max=s[0].length();
		//System.out.println(max);
		for(String st:s) {
			if(st.length()>max) // st.length()<max for min word
				max=st.length();
		}
		System.out.println(max);
		for(String st:s) {
			if(st.length()==max)
				System.out.println(st);
		}
		
}
}