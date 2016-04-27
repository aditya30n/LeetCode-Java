/*Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).*/

class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack = new Stack<>();
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
    while(!stack.isEmpty())
        temp.push(stack.pop());
    temp.push(x);
    while(!temp.isEmpty())
        stack.push(temp.pop());
}

// Removes the element from in front of queue.
public void pop() {
    stack.pop();
}

// Get the front element.
public int peek() {
    return stack.peek();
}

// Return whether the queue is empty.
public boolean empty() {
    return stack.isEmpty();
}
}
