package Strings;

import java.util.Scanner;

public class Checkifstringisdecomposable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();

        System.out.println(s);

        if(isDecompose(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean isDecompose(String s){
        int n = s.length();
        boolean hastwo = false;
        int count =0;

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            for(int j =0;j<n;j++){
                if(ch==s.charAt(j)){
                    count++;
                    i++;
                }
                if(count%3==1){
                    return false;
                } else if (count%3==2) {
                    if(hastwo) return false;
                    else hastwo=true;
                }
            }
        }
        return hastwo;
    }

}
