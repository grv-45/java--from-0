package oops;

public class marks {
    public class data {
        String name;
        int rno;
        int[] marks;

        data(int[] s) {
            marks = s;
        }
    }

    public static void main(String[] args) {

        marks obj = new marks(); // Create object of outer class
        //String name = " grv";
        int[] arr = {34,31,56,43,24};
       data d1 = obj.new data(arr); // Create object of inner class

        d1.name ="pankaj";
        System.out.println(d1.name);
       // d1.marks[0] = 37;
        System.out.println(arr[0]);
        System.out.println("Marks inserted successfully!");
    }
}
