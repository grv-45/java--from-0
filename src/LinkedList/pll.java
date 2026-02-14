package LinkedList;
// node is using form creation.java
class ll{// we are creqting linked list class that will have erery operation and we dont need to create a new node
    // every time we can directly add by function in our linked list class
    Node head;// by default this value will be null
    Node tail;
    int size;
//method tp add on head
    void addathead(int val){
        Node temp = new Node(val);// new node that will store the value
        if(head == null) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }//o(1)
//method to add a data at tail
    void addtotail(int val){
        Node temp = new Node(val); //to add a value we must have need of a node with value
        if(head==null)head = tail= temp;//if(tail== null) temp = head = tail
        else{
          tail.next = temp;
          tail = temp;
        }
        size++;
    }//O(n)
//method to delete from head
  void deleteathead(int val){
        head = head.next;
        if(head == null) return;
        size--;
  }
//mehtod for searching
public void search(int val) {
    Node temp = head;

    while (temp != null) {
        if (temp.val == val) {
            System.out.println(val + " found");
            return;
        }
        temp = temp.next;
    }

    System.out.println(val + " not found");
}

    //method to inserat any index
    void insertatanyindex(int val,int idx){
        if(idx<0||idx>size) {
            System.out.println("invalid");
            return;
        }
        if(idx==0) addathead(val);
        else if(idx==size) addtotail(val);
        else {
            Node temp= head;// from where traversing start
            for(int i =1; i<=idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next= t;
            size++;
        }
    }//O(n),O(1)
//method to delete from index
    void deletefromindex(int idx){
        if(idx<0||idx>=size) return;
        if(idx==0) {deleteathead(0);
            return;}
        Node temp = head;
        for(int i = 1; i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1){
            tail=temp;
                   }
        size--;

    }//O(n),O(1)
//method to display a
    void display(){
        if(head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }

    }
}
public class pll {
    public static void main(String[] args) {
        ll K = new ll();// creatiing  object which store data by help of methods in out ll class
        K.addtotail(34);
        K.addtotail(5);
        K.addtotail(7);
        System.out.print("ll =");
        K.display();
        System.out.println("");
        K.addathead(45);
        K.addathead(45);
        K.deleteathead(45);
        System.out.println(" ");K.display();
        K.search(45);
        K.insertatanyindex(40,2);
        System.out.println("");
        K.display();
        System.out.println(" ");
        K.deletefromindex(2); K.display();
        K.search(45);
    }
}
