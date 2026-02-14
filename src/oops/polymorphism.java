package oops;

public class polymorphism{
    // same name of many form  but have different function or works,
    // it is only an concept
    public static class me{
     void speak(){
            System.out.println("i am speaking");
        }
    }
    public static class you{
        void speak(){
            System.out.println("you are talking");
        }
    }
    public static class he {
        void speak(){
            System.out.println("he is swimming");
        }
    }

    public static void main(String[] args) {
         me grv= new me();
         grv.speak();
         you gr= new you();
         gr.speak();
         he g = new he();
         g.speak();

    }

}


