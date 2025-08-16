class Stack {
    private int arr[];
    private int capacity;
    private int top;
    public  Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public  void push(int value){
        if(top==capacity-1){
            System.out.println("stack overflow");
        }
        else{
            top=top+1;
            arr[top]=value;
            System.out.println(value + " is successfully pushed");
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            System.out.println(arr[top] + " popped from stack");
            return arr[top--];

        }
    }
    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return 0;
        }
        else{
            return arr[top];
        }
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void printStack(){
        if(top == -1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(("Stack elements:"));
        for(int i=0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Show stack elements
        
        stack.pop();
        stack.printStack(); // Show stack after pop
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());

    }

}
