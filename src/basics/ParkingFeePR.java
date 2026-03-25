package basics;
//Question: Parking Charges with Input Validation
//You need to calculate the parking fee based on hours parked.
//        Rules:
//        1. First 2 hours → ₹100/hour
//Material Provided By KN ACADEMY COURSES : TCS NQT Mock test
//Copyrighted @KNACADEMYCOURSES (Check Here : TCS NQT Mock test)
//        2. Next 3 hours → ₹50/hour
//3. Beyond 5 hours → ₹20/hour
import java.util.*;
public class ParkingFeePR {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                int n = sc.nextInt(); // input hours

                if (n < 0) {
                    System.out.println("error");
                    return;
                }

                int charge = 0;

                if (n <= 2) {
                    charge = n * 100;
                } else if (n <= 5) {
                    charge = (2 * 100) + (n - 2) * 50;
                } else {
                    charge = (2 * 100) + (3 * 50) + (n - 5) * 20;
                }

                System.out.println(charge);

            } catch (Exception e) {
                System.out.println("error");
            }

            sc.close();
        }
    }

