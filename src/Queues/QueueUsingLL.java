package Queues;


public class QueueUsingLL {
    public static void main(String[] args) {
        Node.MyQueue q = new Node.MyQueue();
        q.add(45);
        q.add(432);
        q.add(45);
        q.add(432);
        //q.display();
        q.remove();
        q.display();
        q.peek();
        q.display();
    }
}
