package week1;

public class stack_array {
	private String[] s;
	private int N = 0;

	public stack_array(int capacity) {
		s = new String[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(String item) {
		s[N++] = item;
	}

	public void pop() {
		String item = s[--N];
		s[N] = null;
		return;
	}
}
