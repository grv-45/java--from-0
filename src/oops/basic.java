package oops;
import java.util.Scanner;

public class basic {
    // khud ka ek data type or class banana// class bnana jisme hmm vo chije bnayenge jo hmme input me ya print krvani h
    public static class student {
        int obj;
        String st_name;
        int st_age;
        String st_bike;
        int mob; // declaration of object

        // method to print student details
        void print() {// print krne k liye function bnana jo calling se print krne me help krega
            System.out.println("Object number = " + obj);
            System.out.println("Name = " + st_name);
            System.out.println("Age = " + st_age);
            System.out.println("Bike = " + st_bike);
            System.out.println("Mobile = " + mob);
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {// main function(most impoertaant jisme hmm values ki data enter ya input krvayenege
        Scanner sc = new Scanner(System.in);

        // 1st object k liye data
        student st = new student();// new ka use krke object creation
        System.out.print("Enter object number for 1st student: ");
        st.obj = sc.nextInt(); // object input le rhe h
        st.st_name = "Gourav";
        st.st_age = 24;
        st.st_bike = "KTM";
        st.mob = 87324;

        // 2nd object
        student st2 = new student();
        System.out.print("Enter object number for 2nd student: ");
        st2.obj = sc.nextInt();// object input le rhe h
        st2.st_name = "Ravi";
        st2.st_age = 22;
        st2.st_bike = "Royal Enfield";
        st2.mob = 824;

        // print details by function calling
        System.out.println("\n--- Student Details ---");
        st.print();
        System.out.println("\n--- Student Details ---");
        st2.print();

        sc.close();
    }
}
