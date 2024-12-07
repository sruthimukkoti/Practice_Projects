package Java_programs;

import java.util.Stack;

public class stack_reverse {
	static Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		int num=9876;
		System.out.println(reverse(num));

	}
	static void push_digits(int n) {
		while(n>0) {
			st.push(n%10);
			n=n/10;
		}
	}
	
	public static int reverse(int n) {
		push_digits(n);
		int rev=0,i=1;
		while(!st.isEmpty()) {
		rev=rev+i*st.peek();
		st.pop();
		i=i*10;
		}
		return rev;
		
	}

}
