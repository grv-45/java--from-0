package Recursion;

public class preinpost {
    public static void main(String[] args) {
        pip(3);

    }
    public static void pip(int n ){
        if(n==0) return ;
        System.out.print("hello"+n+ " ");//pre
        pip(n-1);
        System.out.print("me" + n+" ");//in
        pip(n-1);
        System.out.print("wow" + n+" ");//postcc
    }
}
