package oops;

class MyArray {
    int[] arr;
    int idx = 0;
    int size = 0;

    MyArray(int capacity) {
        arr = new int[capacity];
    }

    void add(int ele) {
        if (idx == arr.length) { // array is full
            int[] arr2 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];  // FIXED: copy actual values
            }
            arr = arr2; // point to new bigger array
        }
        arr[idx++] = ele;
        size++;
    }

    int capacity() {
        return arr.length;
    }
    int get(int idx){
        return arr[idx];
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class arraylist {
    public static void main(String[] args) {
        MyArray arr = new MyArray(4);

        arr.add(12);
        arr.add(44);
        arr.add(45);
        arr.add(67);
        arr.add(88); // triggers resizing

        arr.display();
        System.out.println("Capacity = " + arr.capacity());
    }
}
