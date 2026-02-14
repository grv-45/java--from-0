package Interface;
// a functional interface is a  interface that has only one method
@java.lang.FunctionalInterface

//interface A {
//    void show (int i);
//        }
//public class FunctionalInterface {
//    public static void main(String[] args) {
////        A obj = new A() {
////             public void show(int i) {
////                 System.out.println("in show A");
////
////            }
////        };
//        //or
//        A obj = (i) -> System.out.println("in show A");// lembda representation
//    obj.show(5);
//
//    }
//}
    //lemba -> works with functional interface only
interface A{
    int add(int i , int j);
}
public class FunctionalInterface{
    public static void main(String[] args) {
//        A obj = new A(){
//            public int add(int i , int j){
//                return i+j;
//            }
//        };
        A obj = (i,j)-> i+j;
        // no need to write return
        int result = obj.add(5,6);
        System.out.println(result);
    }
}