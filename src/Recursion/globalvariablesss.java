package Recursion;
import java.util.*;

public class globalvariablesss {
    static int b ;// global variable
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        b = sc.nextInt();
        fun(1);
        // variables
         int x = 10;
        System.out.println(x);
         change(x);

        x = 6;
        System.out.println(x);
    }
    public static void change(int x ){

        x = 20;
        System.out.println(" hello " + x);
    }
    public static void fun(int a ){

        if (a>b) return;
        System.out.println(" num ="+ a);
        fun(a+1);
    }
}
