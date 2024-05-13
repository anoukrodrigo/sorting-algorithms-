package stackJava;

public class SimpleStack {


		// TODO Auto-generated method stub
		
	
		    private int[] stack;
		    private int top;
		    private int maxSize;

		    // Constructor
		    public SimpleStack(int maxSize) {
		        this.maxSize = maxSize;
		        stack = new int[maxSize];
		        top = -1;
		    }


		    // Method to push an element onto the stack
		    public void push(int item) {
		        if (isFull()) {
		            System.out.println("Stack is full. Cannot push element.");
		            return;
		        }
		        stack[++top] = item;
		    }

		    // Method to pop an element from the stack
		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty. Cannot pop element.");
		            return -1; // Return -1 to indicate underflow
		        }
		        return stack[top--];
		    }

		    // Method to check if the stack is empty
		    public boolean isEmpty() {
		        return top == -1;
		    }

		    // Method to check if the stack is full
		    public boolean isFull() {
		        return top == maxSize - 1;
		    }
		    
		   public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty. Cannot peek element.");
		            return -1; // Return -1 to indicate underflow
		        }
		        return stack[top];
		    }


		    public static void main(String[] args) {
		        SimpleStack stack = new SimpleStack(5);

		        // Adding elements to the stack
		        stack.push(9);
		        stack.push(11);
		        stack.push(13);
		        stack.push(7);
		        stack.push(20);
		        
		        

		        // Printing elements from the stack
		        System.out.println("Elements in the stack:");
		        while (!stack.isEmpty()) {
		            System.out.println(stack.pop());
		           // System.out.println("Peek: " + stack.peek());
		        }
		        
		    }
		


	}


