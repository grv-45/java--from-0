package oops;

// Complex Number Class
class Number {
    int x; // Real Part
    int y; // Imaginary Part

    // Constructor
    Number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display the Complex Number
    void print() {
        if (y >= 0)
            System.out.println(x + " + i" + y);
        else
            System.out.println(x + " - i" + (-y));
    }

    // Store addition result in third object (no return)
    public void add(Number n2, Number result) {
        result.x = this.x + n2.x;
        result.y = this.y + n2.y;
    }

    // Store multiplication result in third object (no return)
    // (a+ib)(c+id) = (ac - bd) + i(ad + bc)
    public void multiply(Number n2, Number result) {
        result.x = (this.x * n2.x) - (this.y * n2.y);
        result.y = (this.x * n2.y) + (this.y * n2.x);
    }

    // Store subtraction result in third object (no return)
    public void subtract(Number n2, Number result) {
        result.x = this.x - n2.x;
        result.y = this.y - n2.y;
    }
}

public class complexnumber {
    public static void main(String[] args) {

        Number n1 = new Number(4, 6);
        Number n2 = new Number(9, -5);

        System.out.println("First Number:");
        n1.print();
        System.out.println("Second Number:");
        n2.print();

        Number result = new Number(0,0); // result object

        // Add
        n1.add(n2, result);
        System.out.print("\n;Addition Result: ");
        result.print();

        // Multiply
        n1.multiply(n2, result);
        System.out.print("\nMultiplication Result: ");
        result.print();

        // Subtract
        n1.subtract(n2, result);
        System.out.print("\nSubtraction Result: ");
        result.print();
    }
}
