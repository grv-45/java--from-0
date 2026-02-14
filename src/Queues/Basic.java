package Queues;

import java.util.LinkedList;
import java.util.Queue;

//line oin ticket buying , work on FIFO,LILO
//funx : add,(poll)(POP)remove,peek,size
//insert from rear ,remove from front;
public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(34); q.add(56); q.add(323); q.add(12);
        System.out.println(q+" "+q.peek());
        q.remove();
        System.out.println(q+" "+q.size());

    }
}
