package java_projects;

import java.util.Stack;

public class program21 {
//reverse of a number using stack
	static Stack<Integer> st = new Stack<>();

	static void push_digits(int number) {
	while (number != 0) {
	st.push(number % 10);
	number = number / 10;
	}
	System.out.println(st);
	}

	static int reverse_number(int number) {
	push_digits(number);
	int reverse = 0;
	int i = 1;

	while (!st.isEmpty()) {
	reverse = reverse + st.peek()*i;
	System.out.println(reverse);
	st.pop();
	i = i * 10;
	}

	return reverse;
	}

	public static void main(String[] args) {

	int number = 3997;
	System.out.println(reverse_number(number));
	}
}
