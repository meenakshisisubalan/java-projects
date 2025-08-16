import java.util.*;
class Node{
    int data;
    Node next;
    Node(int num){
        this.data=num;
        this.next=null;
    }
}
class LinearSearchLinkedList{
    Node head=null;
    Node temp=null;
    public void sll(int num){
        Node newnode=new Node(num);
        if(head==null){
            head=newnode;
            temp=newnode;
        }
        else{
            temp.next=newnode;
            temp=newnode;
        }
    }
    // Method to perform linear search in the linked list
    public void  linearSearch(int key) {
        temp = head;
        int position=0;
        boolean found = false;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + position);
                found = true;
                break; // Exit loop when element is found
            }
            temp = temp.next;
            position++;
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
    public void display(){
        temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinearSearchLinkedList list=new LinearSearchLinkedList();
        while(true){
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            list.sll(num);
        }
        int key=sc.nextInt();
        list.display();
        list.linearSearch(key);
    }
}