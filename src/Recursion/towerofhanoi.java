package Recursion;

public class towerofhanoi {
    public static void main(String[] args) {
         hanoi(5,'a','b','c');
    }
    public static void hanoi(int i,char src,char helper,char dest){
        if(i==0) return;
        //take n-1 disk from A to B via C
        hanoi(i-1,src,dest,helper);
        //largest from Ato C
        System.out.println(src+"->"+dest);
        //n-1 disk from Bto C via A
        hanoi(i-1,helper,src,dest);
    }
}
