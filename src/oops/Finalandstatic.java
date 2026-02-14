package oops;

class Cricketer{
    //final String country = "India";// value will remain constant
    static  String country;
    int runs;
    String name;
    Double avg;

    Cricketer(int runs, String name, Double avg){
        this.runs = runs ;
        this.name = name;
        this.avg = avg;
    }
    void print (){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("it is a sharable keyword mean it can be accessed by every keyword na d gives same output ");
    }

}

public class Finalandstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(22222,"kohli",59.7);
        //c1.country = "England";// give error bec. country is fixed
        c1.country = "India";
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer(222,"hli",55.7);
        System.out.println("c2 country "+ c2.country);// india even being not declared
        c1.print();
        c1.greet();
        c2.greet();
    }
}
