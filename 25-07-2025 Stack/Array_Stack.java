class ArrayStack {
    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }
    public void push(int x) {
        if (top == stack.length - 1)
            throw new StackOverflowError();
        stack[++top] = x;
    }
    public int pop() {
        if (top == -1)
            throw new EmptyStackException();
        return stack[top--];
    }
    public int peek() {
        if (top == -1)
            throw new EmptyStackException();
        return stack[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
