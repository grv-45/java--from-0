package arrays;

import java.util.Scanner;

public class nextpermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        warehouse(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void warehouse(int[] arr){

        int n = arr.length;

        int i = n - 2;

        while(i >= 0 && arr[i] >= arr[i + 1]){
            i--;
        }

        int j = n - 1;

        if(i >= 0){
            while(arr[j] <= arr[i]){
                j--;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        reverse(arr, i + 1, n - 1);
    }

    public static void reverse(int[] arr, int s, int e){

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}