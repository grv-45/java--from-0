package Queues;
  class Node{
    Node next;
    int val;
    Node(Node next){
        this.next= next;
    }

      public Node(int val) {
        this.val=val;
      }

      public static class MyQueue {
    Node head;
    Node tail;
    int size;

    public void add(int val) {
        Node temp = new Node(val);
        if(tail==null)  head = tail=temp;
        else{tail.next= temp;
        tail=temp;

        }
    size++;
    }

    public int  remove() {

        int front = head.val;
         head = head.next;
         size--;
         return front;
          }

          public int  peek() {
            if(size==0) {
                  System.out.println("eror");
                  return -1;
              }
              return head.val;
          }

          public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
          }
      }

}
