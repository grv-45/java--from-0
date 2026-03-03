package arrays;

public class ONe {
    public static void main(String[] args) {


        int[] arr = new int[256];
        String s = "fwfw";
        int n = s.length();
        for (int i = 0; i < n; i++){
            char c1 = s.charAt(i);
            System.out.println(arr[c1]);
        }
    }
}