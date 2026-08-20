package basics;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // 1. Integer Types
        byte b = 127;                  // 1 byte (-128 to 127)
        short s = 32767;              // 2 bytes (-32,768 to 32,767)
        int i = 2147483647;           // 4 bytes (-2^31 to 2^31 - 1)
        long l = 9223372036854775807L; // 8 bytes (requires 'L' suffix)

        // 2. Floating-Point Types
        float f = 3.1415927f;          // 4 bytes (requires 'f' suffix, 6-7 decimal digits precision)
        double d = 3.141592653589793;  // 8 bytes (15-16 decimal digits precision)

        // 3. Character Type
        char c = 'J';                  // 2 bytes (stores single Unicode character)

        // 4. Boolean Type
        boolean isJavaAwesome = true;  // 1 bit of information (true or false)

        System.out.println("=== Integer Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("\n=== Floating-Point Types ===");
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n=== Character Type ===");
        System.out.println("char: " + c);

        System.out.println("\n=== Boolean Type ===");
        System.out.println("boolean: " + isJavaAwesome);
    }
}