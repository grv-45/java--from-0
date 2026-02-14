package LinkedList;
// for creation of a linked list we must have need of class node that contain value and next of node
// node has two part value and next(nex has address of next node
class Node {
    int val;
    Node next;

    Node(int val) {// node constructor
        this.val = val;
    }
}

public class creation {

    public static void main(String[] args) {
        Node a = new Node(3); // creation of first node and assingning its value by the help of cnstructor
        Node b = new Node(4);
        Node c = new Node(45);
        Node d = new Node(23);
        Node e = new Node(12);

        a.next = b;// pointing next of a node to b node (this way nodes aare connected with each other
        b.next = c;
        c.next = d;
        d.next = e;

        printList(a);
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
