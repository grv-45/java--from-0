package Mergesort;

public class merge {
    public static void main(String[] args) {
        int arr[] ={5,55,3,34,42,32,3,};
        mergesort(arr);
        for(int ele :arr) System.out.print(ele+"-");
    }
     private static void mergesort(int[] arr){
        if(arr.length == 1 ) return;
        int n = arr.length;
        //s1: create 2 empty array for merging them
        int [] a = new int[n/2]; int[] b = new int[n-n/2];
        //s2 : copy paste arr into a nad b;
        int idx =0; // idx travel karnega arr pe
        for(int i = 0 ; i<a.length;i++){
            a[i] =arr[idx++];
        }
        for(int i = 0 ; i<b.length;i++){
            b[i] =arr[idx++];
        }
        //sorting in a and b
        mergesort(a);
        mergesort(b);
        //merge a and b into arr
       merge(a,b,arr);
    }
    public static void merge(int[] a ,int [] b , int[] arr){
        int i =0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
}
