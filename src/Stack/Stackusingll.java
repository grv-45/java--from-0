package Stack;

class Node{
int val;
Node next;
Node(int val){
    this.val=val;
}
}

class Stack1{
    Node head;
    int size;

     public int peek() throws Exception {
         if(head==null){
             throw new Exception("Stack underflow");
         }
         return head.val;
     }
     public int pop()throws Exception{
         if(head==null){
             throw new Exception("Stack underflow");
         }
         int x = head.val;
         head=head.next;
         size--;
         return x;
     }
     public void push(int val) {

         Node temp = new Node(val);
         if (size == 0) head = temp;
         else {
             temp.next = head;
             head = temp;
         }
         size++;
     }
     public void display(){
         Node temp= head;
         while(temp!=null){
             System.out.println(temp.val);
             temp=temp.next;
         }
         System.out.println();
     }


}
public class Stackusingll {
    public static void main(String[] args) throws Exception {
Stack1 st2= new Stack1();
st2.push(34);
st2.push(343);
st2.push(34);
st2.push(343);
st2.display();

st2.pop();
        st2.display();
        System.out.println(st2.peek());

    }
}
