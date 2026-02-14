package oops;
//encapsulation
class Human
{
    private int age ;//=56;
     private String name;// name ="Gorv";

     public int getage(){
         return age;
     }

    public void setage(int a ){
        age = a;
    }
     public String getname(){
         return name;
     }
    public void setname(String n ){
        name =n;
    }


}
public class Encapsulation {
    public static void main(String[] args) {


    Human h1 = new Human();
    //h1.age=45;
   // h1.name="lksd";
        h1.setage(34);
        h1.setname("Gourav");
        System.out.println(h1.getage());
        System.out.println(h1.getname());
}}
