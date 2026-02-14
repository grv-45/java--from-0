package oops;

class Students { // class name should start with capital letter by convention
    String name;
    private int roll_no; // private variable
    double cgpa;

    // Setter method for roll_no
    void setrno(int x) {
        roll_no = x;
    }

    // Getter method for roll_no
    int getrno() {
        return roll_no;
    }

    // Method to print details
    public void print() {
        System.out.println(name + " " + cgpa + " " + roll_no);
    }
}

public class privatekeyword { // removed static
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Kritika";
        s1.cgpa = 7.5;
        s1.setrno(21); // setting roll number using setter
        s1.print();     // print details

        Students s2 = new Students();
        s2.print();     // prints default values (null, 0.0, 0)
    }
}
