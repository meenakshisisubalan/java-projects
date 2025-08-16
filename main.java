/*import java.util.*;
class Node 
{
    int data;
    Node next;
    Node prev;
    Node(int num)
    {
        this.data=num;
        this.prev=null;
        this.next=null;
    }
}
class Main 
{
    Node head=null;
    Node temp=null;
    Node tail=null;
    public void cll(int num)
    {
        Node newnode=new Node(num);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            tail.next=head;
            head.prev=tail; 
        }
        else 
        {
           tail.next=newnode;
           newnode.prev=tail;
           tail=newnode;
           tail.next=head;
           head.prev=tail;
        }
    }
    public void insertion_at_beg(int num){
        Node newnode=new Node(num);
        newnode.data=num;
        newnode.next=null;
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
            head.prev=tail;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void insertion_at_end(int num){
        Node newnode=new Node(num);
        newnode.data=num;
        newnode.next=null;
        if(tail.next==head){
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void deletion_at_beg(){
        temp=head;
        head=head.next;
        tail.next=head;
        head.prev=tail;
        temp.next=null;
        temp.prev=null;
    }
    public void display()
    {
        temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+"\n");
        temp=tail;
        while(temp.prev!=tail)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.print(temp.data+" ");
    }
    public void deletion_at_end(){
        temp=tail;
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
        temp.next=null;
        temp.prev=null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Main list=new Main();
        while(true)
        {
            int num=sc.nextInt();
            if(num==-1)
            {
                break;
            }
            list.cll(num);
        }
        int n=sc.nextInt();
        list.insertion_at_beg(n);
        int m=sc.nextInt();
        list.insertion_at_end(m);
        list.deletion_at_beg();
        list.deletion_at_end();
        list.display();
    }
}*/
//stack with array
/*import java.util.*;
class Main{
    private static int size=5;
    private static int stack[]=new int [size];
    private static int top=-1;
    public static void  push(int num)
    {
        if(top==size-1){
            System.out.println("stack is overflow");
        }
        else
        {
            top++;
            stack[top]=num;
        }
        
    }
    public static void pop(){
        if(top==-1)
        {
            System.out.println("empty");
        }
        else
        {
            top--;
        }
    }
    public static void peak(){
        if(top==-1)
        {
            System.out.println("empty");
        }
        else
        {
            System.out.println(stack[top]);
        }
    }
    public static void display()
    {
        if(top==-1)
        {
            System.out.println("empty");
        }
        else
        {
            int ind;
            for(ind=top;ind>=0;ind--)
            {
                System.out.print(stack[ind]+ " ");
            }
        }   
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            push(sc.nextInt());
        }
        pop();
        peak();
        display();
    }
}*/
//stack in linked list
/*class Main{
    private static int max_size=100;
    private static int queue[]=new int [max_size];
    private static int front=-1;
    private static int rear=-1;
    public static void  enqueue(int num)
    {
        if(rear==max_size){
            System.out.println("queue is full");
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        queue[rear]=num;
    }
    public static void dequeue(){
        if(front==-1)
        {
            System.out.println("queue is empty");
        }
        else
        {
            front++;
        }
    }
    public static void display()
    {
        if(front==-1)
        {
            System.out.println("empty");
        }
        else
        {
            int i;
            for(i=0;i<=rear;i++)
            {
                System.out.print(queue[i]+ " ");
            }
        }   
    }
    public static void main(String args[])
    {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        enqueue(60);
        dequeue();
        dequeue();
        display();
    }
}*/
/*class Main 
{
    private static int MAX_SIZE=5;
    private static int queue[]=new int[MAX_SIZE];
    private static int front=-1;
    private static int rear=-1;
    public static void enqueue(int num)
    {
        if(rear==MAX_SIZE-1)
        {
            System.out.println("Queue is full");
        }
        else 
        {
            if(front==-1)
            {
               front=0; 
            }
            rear++;
            queue[rear]=num;
        }
    }
    public static void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            front++;
        }
    }
    public static void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            int i;
            for(i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        dequeue();
        enqueue(70);
        display();
    }
}*/
//circular queue
class Main 
{
    private static int MAX_SIZE=5;
    private static int queue[]=new int[MAX_SIZE];
    private static int front=-1;
    private static int rear=-1;
    public static void enqueue(int num)
    {
        if(rear+1%MAX_SIZE==front)
        {
            System.out.println("Queue is full");
        }
        else 
        {
            if(front==-1)
            {
               front=0; 
            }
            rear=(rear+1)%MAX_SIZE;
            queue[rear]=num;
        }

    }
    public static void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            front=front+1;
        }
    }
    public static void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            int i;
            for(i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        dequeue();
        enqueue(70);
        display();
    }
}