
public class StackClass {

    private int[] stack;
    private int top;
    private int capacity;

    public StackClass(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1; // Indicating stack is empty
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // Indicating stack is empty
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackClass stack = new StackClass(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size after pop is: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.pop(); // Popping remaining elements
        stack.pop();
        System.out.println("Is stack empty after popping all? " + stack.isEmpty());
        stack.pop(); // Attempting to pop from an empty stack   
        stack.push(40);
        System.out.println("Top element after pushing 40: " + stack.peek());
        stack.push(50);
        stack.push(60); // This will cause stack overflow           

    }
}
