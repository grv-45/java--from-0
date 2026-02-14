package Strings;
import java.util.Scanner;

public class basics {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. String Declaration and Initialization
            String str1 = "Hello";       // String literal, stored in String pool
            String str2 = new String("World"); // String object, stored in heap

            System.out.println("str1: " + str1); // Output: Hello
            System.out.println("str2: " + str2); // Output: World

            // 2. Taking String Input from user
            System.out.print("Enter a string: ");
            String input = sc.nextLine(); // nextLine() reads whole line including spaces
            System.out.println("You entered: " + input);

            // 3. String Length
            int len = input.length(); // returns number of characters in string
            System.out.println("Length of input: " + len);

            // 4. Character at a specific index
            if(len > 0) {
                char ch = input.charAt(0); // first character
                System.out.println("First character: " + ch);
            }

            // 5. Concatenation
            String concatStr = str1 + " " + str2; // using + operator
            System.out.println("Concatenated string: " + concatStr);

            // 6. Comparing Strings
            if(str1.equals(str2)) { // equals() checks content
                System.out.println("str1 and str2 are equal");
            } else {
                System.out.println("str1 and str2 are not equal");
            }

            // 7. Comparing ignoring case
            if(str1.equalsIgnoreCase("hello")) {
                System.out.println("str1 equals 'hello' ignoring case");
            }

            // 8. String to UpperCase / LowerCase
            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());

            // 9. Checking if string contains a substring
            if(input.contains("Java")) {
                System.out.println("Input contains 'Java'");
            } else {
                System.out.println("Input does not contain 'Java'");
            }

            // 10. Substring
            if(len >= 5) {
                String sub = input.substring(0, 5); // from index 0 to 4
                System.out.println("Substring (0-4): " + sub);
            }

            // 11. Trimming spaces
            String withSpaces = "   Java Programming   ";
            System.out.println("Before trim: '" + withSpaces + "'");
            System.out.println("After trim: '" + withSpaces.trim() + "'");

            // 12. Replacing characters / substrings
            String replaced = input.replace('a', '@'); // replace char
            System.out.println("After replacing 'a' with '@': " + replaced);

            String replacedStr = input.replace("Java", "Python"); // replace substring
            System.out.println("After replacing 'Java' with 'Python': " + replacedStr);

            // 13. Checking startsWith / endsWith
            if(input.startsWith("I")) {
                System.out.println("Input starts with 'I'");
            }
            if(input.endsWith("!")) {
                System.out.println("Input ends with '!'");
            }

            // 14. Splitting a string
            String data = "Apple,Banana,Cherry";
            String[] fruits = data.split(","); // split by comma
            System.out.println("Fruits:");
            for(String fruit : fruits) {
                System.out.println(fruit);
            }

            // 15. Converting string to char array
            char[] charArr = input.toCharArray();
            System.out.println("Characters in input:");
            for(char c : charArr) {
                System.out.print(c + " ");
            }
            System.out.println();

            // 16. Checking if string is empty
            String emptyStr = "";
            if(emptyStr.isEmpty()) {
                System.out.println("String is empty");
            }

            // 17. String formatting
            String name = "Alice";
            int age = 20;
            String formatted = String.format("Name: %s, Age: %d", name, age);
            System.out.println(formatted);
        }
    }



