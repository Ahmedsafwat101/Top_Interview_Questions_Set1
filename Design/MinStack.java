package Design;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MinStack {
    /** initialize your data structure here. */
    private Deque<Integer>deque;
    private PriorityQueue<Integer>queue;
    public MinStack() {
     deque= new ArrayDeque<>();
     queue= new PriorityQueue<>();
    }

    public void push(int x) {
     deque.push(x);
     queue.add(x);
    }

    public void pop() {
    queue.remove(deque.pop());
    }

    public int top() {
      return deque.peek();
    }

    public int getMin() {
      return queue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


