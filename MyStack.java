import java.util.LinkedList;

public class MyStack {

	LinkedList<Integer> queue = new LinkedList<Integer>();
	// Push element x onto stack.
	public void push(int x) {
		queue.add(0, x);
	}
	// Removes the element on top of the stack.
	public void pop() {
		int nums[] = new int[queue.size()];
		for (int n = 0; n < nums.length; n++) {
			nums[n] = queue.pop();
		}
		for (int i = 0; i < nums.length - 1; i++) {
			queue.add(nums[i]);
		}
	}
	// Get the top element.
	public int top() {
		int nums[] = new int[queue.size()];
		for (int n = 0; n < nums.length; n++) {
			nums[n] = queue.pop();
		}
		for (int i = 0; i < nums.length - 1; i++) {
			queue.add(nums[i]);
		}
		return nums[nums.length - 1];
	}

	// Return whether the stack is empty.

	public boolean empty() {
		return queue.isEmpty();
	}

}
