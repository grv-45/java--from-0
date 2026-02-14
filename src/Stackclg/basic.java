package Stackclg;
import java.util.Scanner;

public class basic {
    // Stack implementation using array
    int ar[];
    int top;

    // Constructor
    basic() {
        ar = new int[10];
        top = -1;
    }

    // Push operation
    void push() {
        if (top == ar.length - 1) {
            System.out.println("Stack is full (Overflow)");
        } else {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter the data you want to push: ");
            int data = sc2.nextInt();
            top = top + 1;
            ar[top] = data;
            System.out.println("Data inserted: " + data);
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)");
        } else {
            System.out.println("Deleted: " + ar[top]);
            top = top - 1;
        }
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peek element: " + ar[top]);
        }
    }

    // Display operation
    void traverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(ar[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        basic s = new basic();

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.traverse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
