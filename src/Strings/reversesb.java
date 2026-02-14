package Strings;

public class reversesb {
    public static void main(String[] args) {
        String s = "Gourav";
        StringBuilder sb = new StringBuilder(s);
        //sb.reverse();
        int i = 0, j = sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb.toString());

    }
}
