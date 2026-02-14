
// Scanner import karte hain input lene ke liye
import java.util.Scanner;

class JavaBasics {
    public static void main(String[] args) {

        // -------------------- 1️⃣ OUTPUT --------------------
        // println → line change karta hai, print → same line me likhta hai
        System.out.print("Welcome ");
        System.out.print("to Java Programming!");
        System.out.println("\n"); // \n se line change hoti hai

        // -------------------- 2️⃣ VARIABLES & DATA TYPES --------------------
        System.out.println("2️⃣ Variables & Data Types:");
        int age = 20;          // integer (whole number)
        double price = 99.99;  // decimal number
        char grade = 'A';      // single character
        boolean isPass = true; // true/false value
        String name = "Garv";  // string (text)

        // + ka use concatenate (join) karne ke liye hota hai
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPass);
        System.out.println();

        // -------------------- 3️⃣ OPERATORS --------------------
        System.out.println("3️⃣ Arithmetic Operators:");
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));      // +
        System.out.println("Subtraction: " + (a - b));   // -
        System.out.println("Multiplication: " + (a * b));// *
        System.out.println("Division: " + (a / b));      // int/int → int result
        System.out.println("Modulus: " + (a % b));       // remainder
        System.out.println();

        // -------------------- 4️⃣ USER INPUT --------------------
        System.out.println("4️⃣ User Input:");
        Scanner sc = new Scanner(System.in); // Scanner object banaya input lene ke liye
        System.out.print("Enter a number: ");
        int x = sc.nextInt(); // integer input
        System.out.println("Square of " + x + " is: " + (x * x));
        System.out.println();

        // -------------------- 5️⃣ MODULUS OPERATOR --------------------
        System.out.println("5️⃣ Modulus Operator:");
        System.out.println("37 % 6 = " + (37 % 6)); // remainder 1
        System.out.println("5 % 3 = " + (5 % 3));   // remainder 2
        System.out.println("7 % 10 = " + (7 % 10)); // numerator chhota ho → result same number
        System.out.println();

        // -------------------- 6️⃣ TYPECASTING --------------------
        System.out.println("6️⃣ Typecasting Example:");
        int p = 5, q = 2;
        double result = (double) p / q; // int → double convert
        System.out.println("Result after typecasting: " + result);
        System.out.println();

        // -------------------- 7️⃣ BODMAS / PRECEDENCE --------------------
        System.out.println("7️⃣ BODMAS Example:");
        int y1 = 4 * 2 / 3; // int/int → int
        double y2 = 4 * 2.0 / 3; // double ke saath → double result
        System.out.println("x = 4*2/3 (int) => " + y1);
        System.out.println("y = 4*2.0/3 (double) => " + y2);
        System.out.println();

        // -------------------- 8️⃣ INCREMENT / DECREMENT --------------------
        System.out.println("8️⃣ Increment / Decrement:");
        int num = 10;
        System.out.println("num = " + num);
        System.out.println("Post-increment (num++): " + (num++)); // pehle print, phir badhao
        System.out.println("After post-increment: " + num);
        num = 10;
        System.out.println("Pre-increment (++num): " + (++num)); // pehle badhao, phir print
        System.out.println();

        // -------------------- 9️⃣ CHAR & ASCII --------------------
        System.out.println("9️⃣ Char & ASCII Value:");
        char ch = 'A';
        int ascii = (int) ch; // char → int typecast
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);
        System.out.println();

        // -------------------- 🔟 VARIABLE NAMING RULES --------------------
        System.out.println("🔟 Variable Naming Rules:");
        int _num = 10;      // valid (underscore allowed)
        int $amount = 500;  // valid (dollar allowed)
        int num1 = 5;       // valid (numbers allowed but not at start)
        // int 1num = 10;   // ❌ invalid (cannot start with number)
        // int my-num = 7;  // ❌ invalid (no hyphen)
        // int class = 10;  // ❌ invalid (keyword not allowed)
        System.out.println("Valid variables: " + _num + ", " + $amount + ", " + num1);

        System.out.println("\n✅ Program Completed Successfully!");
    }
}
