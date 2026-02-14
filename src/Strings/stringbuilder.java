package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(6);
        System.out.println(sb.length()+" "+ sb.capacity());
        System.out.println(sb);
        sb.append("Hello kritika Thakur");
        System.out.println(sb);
        System.out.println(sb.length()+" "+ sb.capacity());
        sb.setCharAt(3,'t');
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,'b');
        sb.delete(7,11);//7 to 11
        System.out.println(sb);
    }
}
