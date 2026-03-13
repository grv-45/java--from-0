package arrays;

import java.util.Scanner;

public class oddballon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Character[] arr = new Character[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        boolean found = false;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count % 2 != 0){
                System.out.println(arr[i] + " " + count);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("all are even");
        }
    }
}