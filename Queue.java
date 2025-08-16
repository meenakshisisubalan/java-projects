
public class Queue {
    private int front, rear, size, capacity;
    private int[] queue;

    Queue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.queue = new int[capacity];
    }

    // Enqueue Operation
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1);
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued");
    }

    // Dequeue Operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1);
        size--;
        System.out.println(item + " dequeued");
        return item;
    }

    // Peek at the Front Element
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        System.out.println("Front element: " + queue.peek());
    }
}
