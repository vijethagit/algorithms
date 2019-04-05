package stack;

public class SortWithStack {
	
	public static void main(String[] args) {
		SortWithStack sws = new SortWithStack();
		Stack originalStack = new Stack();
		Integer[] numbers = new Integer[] {3, 5, 1, 8, 6, 9, 2, 4};
		for (int i = 0; i < numbers.length; i++) {
			originalStack.push(numbers[i]);
		} 
		sws.sort(originalStack);
		
	}
	
	public void sort (Stack os) {
		Stack ss = new Stack();

		while(!os.isEmpty()) {
			Integer temp = os.pop();
			while (!ss.isEmpty() && ss.peek() > temp) {
				os.push(ss.pop());
			}
			ss.push(temp);
		}
		while (!ss.isEmpty()) {
			os.push(ss.pop());
		}
		while (!os.isEmpty()) {
			System.out.print(os.pop() + " ");
		}
	}

}
