package TREE;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node right;
    Node left;

    Node(int val){
        this.val = val;
    }

}
class pair{
    Node node;
    int level;
    pair(Node node,int level){
        this.node=node;
        this.level = level;
    }
}

public class basic {

    public static void main(String[] args) {
        //            3
        //          /    \
        //         4      23
        //        /  \    /   \
        //       54  332,34    33
         Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(23);
        Node d = new Node(54);
        Node e = new Node(332);
        Node f = new Node(34);
        Node g = new Node(33);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        //levelordertraversal(a);
        levelwise(a);

//        display(a);
//        System.out.println("size ="+size(a));
//        System.out.println("sum="+ Sum(a));
//        System.out.println("product ="+ product(a));

    }

    private static void levelwise(Node root) {
        Queue<pair>  q= new LinkedList<>();
        q.add(new pair(root,0));
        int crl=0;
        while(q.size()>0){
            pair front = q.remove();
            if(front.level!=crl){
                crl++;
                System.out.println();
            }
            System.out.print(front.node.val +" ");
            if(front.node.left!=null) q.add(new pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new pair(front.node.right,front.level+1));
        }
        System.out.println();
    }

    private static void levelordertraversal(Node root) {
        Queue<Node>  q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(root.left!=null) q.add(front.left);
            if(root.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+"->");
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
         int leftsize= size(root.left);
         int rightsize= size(root.right);
         return 1+leftsize+rightsize;
         //return 1+size(root.left)+size(root.right);
    }

    public static int Sum(Node root){

        if(root==null) return 0;
        return root.val+Sum(root.left)+Sum(root.right);
    }

    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }

    public static int max(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));

    }
    public static int level(Node root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left),level(root.left));

    }
}

