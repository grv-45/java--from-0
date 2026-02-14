package oops;

public class Constructor {
    public static class student {
        int obj;
        String st_name;
        int st_age;
        String st_bike;
        int mob; // declaration of object

        // Parameterized constructor
        student(int x, String name, int age, String bike, int mo){// value assign krdenge ek constructr bnake jo helpful hoga
            obj = x;
            st_name = name;
            st_age = age;
            st_bike = bike;
            mob = mo;
        }

        // Method to print student details
        void print(){
            System.out.println(obj + " " + st_name + " " + st_age + " " + st_bike + " " + mob);
        }
    }

    public static void main(String[] args) {
        // Pass all 5 arguments
        student s1 = new student(1, "Kritika", 34, "Hayabusa", 987654321);// object creae krke usme value set krdenge
        s1.print();
    }
}
