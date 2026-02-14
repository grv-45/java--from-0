package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class traversalinq {
    private static void display(Queue<Integer> q){
        for(int i = q.size() ;i>0;i--){
            System.out.println(q.peek()+"->");
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue q = new LinkedList<>();
        q.add(4545); q.add(1345); q.add(545); q.add(4565);
        System.out.println(q);
        display(q);
        addatindex(q,56,3);
        display(q);



    }

    private static void addatindex(Queue<Integer> q,int val, int idx) {
    int n = q.size();
        for(int i =1;i<=idx;i++){
        q.add(q.remove());
    }
    q.add(val);
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
    }
}
