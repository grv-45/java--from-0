package Queues;

class CircularQueue{
    int[] arr;
    int f;
    int r;
    int size;

    public CircularQueue(int size) {
     arr = new int[size];
    }

    public void add(int val) {
        if(size==arr.length){
            System.out.println("array full");
         return;
        }
        arr[r] =val;
        r++;
        if(r==arr.length) r=0;
        size++;
    }

    int  remove() {
        if(size==0){
            System.out.println("can not add");
            return -1;
        }
        if(f==arr.length) f=0;
        int frontval=arr[f];
        f++;
        size--;
        return frontval;
    }

    public int peek() {
        
        if(size==0){
            System.out.println("q is empty");
            return -1;
        }
        return arr[f];
        
    }
    public void display() {
        if(size==0) return;

        if(f >= r){
            for(int i = f; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            for(int i = 0; i < r; i++){
                System.out.println(arr[i]);
            }
        }
        else {
            for(int i = f; i < r; i++){
                System.out.println(arr[i]);
            }
        }
    }

}
public class Queueusinfarr {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(37);
        q.add(546);
        q.add(3242);
        q.display();
        q.remove();
        q.peek();
        q.display();
        
    }
}
