package stack;

import java.util.EmptyStackException;

public class Stack {

	private class Node {
		private Integer data;
		private Node next;

		public Node(Integer v) {
			data = v;
		}
	}

	Node top;

	public void push(Integer x) {
		Node n = new Node(x);
		n.next = top;
		top = n;
	}

	public Integer pop() {
		if(top == null) throw new EmptyStackException();
		Integer value = top.data;
		top = top.next;
		return value;
	}

	public Integer peek() {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty(){
		return (top == null);
	}
	
	public static void main(String[] args) {
		Integer[] numbers = new Integer[] {3, 5, 1, 8, 6, 9, 2, 4};
		Stack stack = new Stack();
		for (int i = 0; i < numbers.length; i++) {
			stack.push(numbers[i]);
		}
		
		while(!stack.isEmpty()) {
			Integer i = stack.pop();
			System.out.print(i + " ");
		}
	}
}
