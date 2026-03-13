package arrays;

import java.util.Scanner;

public class Monkeyqt {
    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of monkeys
        int p =sc.nextInt(); // number of peanuts
        int m = sc.nextInt(); // number of bananas
        int k = sc.nextInt(); // one time banana can eat
        int j = sc.nextInt(); // peanut capacity

        int banana_eat= m/k;
        int rem_banana_eat = m%k;

        int peanut_eat= p/j;
        int rem_peanut_eat = p%j;

        int left_monkey= n-(banana_eat+peanut_eat);
        if(rem_banana_eat!=0|| rem_peanut_eat!=0){
           left_monkey= left_monkey-1;
        }
        System.out.println(left_monkey);
    }
}
