package Stack;

import java.util.Stack;

//a data structure store data amd work on lifo and filo,unlimited size
 //stack opn=push,pop,can aces only top,peek(top)
public class Basic {

    public static void main(String[] args) {
// stack creation
        Stack<String> st1= new Stack<>();
        //st1.pop();//EmptyStackException,underflow
        st1.push("grv");
        st1.push("kritika");
        st1.push("bhuvan");
        st1.push("nitin");
        System.out.println(st1.size());
        System.out.println(st1);
        System.out.println(st1.pop());
        System.out.println(st1);
        System.out.println(st1.peek());
    }
}
