package Recursion;
import java.util.*;

public class oneton {
    static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);

    }
    public static void print (int x){
        if(x>n) return;
        System.out.println("x= "+ x);
        print(x+1);
    }
}
