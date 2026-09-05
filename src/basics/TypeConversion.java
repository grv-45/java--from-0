package basics;

public class TypeConversion {
    public static void main(String[] args) {

        //implicit: those converion where destination is larger  than source data type
        //Byte to int
        byte b=98;
        int i =b;
        System.out.println("aFter conversion i :"+ i);

        //character to int
        char c = 'a';
        int value = c;
        System.out.println("After conversion value :"+ value);


        //Explicit: for such cases where destination  data type is smaller
        //int to byte
        int e =675;
        byte o = (byte)e;

        System.out.println("o:"+o);//675%256

        //int to long
        long l = 45;
        int m = (int)l;
        System.out.println("m:"+m);


        //int to char;

        int word = 567;
        char n= (char)word;
        System.out.println("n:"+n);



    }
}
