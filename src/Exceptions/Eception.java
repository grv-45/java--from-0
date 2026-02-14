package Exceptions;

public class Eception {
    public static void main(String[] args) {


        int i =0;
        int j =0;
        int[] nums = new int[4];
        try{
            j=238/i;// if heree is no exception then chek 2nd otherwise jump out

            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("hfkehfkjhkjhskjsjkgh"+e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("jflwjflwjf+e");
        }
        System.out.println(j);
        System.out.println("byeeeeeeee..........");
    }
}
