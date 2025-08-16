class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize queue
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue operation (Insertion)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full! Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued to queue.");
    }

    // Dequeue operation (Deletion)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return -1;
        }
        int removedValue = queue[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) { // Reset front and rear when queue becomes empty
            front = -1;
            rear = -1;
        }
        System.out.println(removedValue + " dequeued from queue.");
        return removedValue;
    }

    // Peek (Get front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Circular Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60); // Queue Full
        
        cq.display();
        
        cq.dequeue();
        cq.dequeue();
        
        cq.display();
        
        cq.enqueue(60);
        cq.enqueue(70);
        
        cq.display();
    }
}
