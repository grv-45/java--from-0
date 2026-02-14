package Exceptions;

public class Finally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 34 / i;
            System.out.println("snlsnf");
        } catch (Exception e) {
            System.out.println("jknkjnvnk" + e);
        } finally {
            System.out.println("no one can stop me ");
        }
    }
}
