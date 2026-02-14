package Recursion;

public class array {
    public static void main(String[] args) {
        int [] arr = {12,23,4,54,56,75,45};
        revprint(arr,arr.length-1);
    }
    public static void revprint(int[] arr , int idx){
        if(idx<0) return;
        System.out.println(arr[idx]);
        revprint(arr, idx-1);
    }
}
