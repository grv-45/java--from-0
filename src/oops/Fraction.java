package oops;
class Fraction2 {
    int num;
    int den;

    Fraction2(int num, int den) {
        if (den == 0) {
            System.out.println("denominator cant be 0");
            den = 1;
        }
        this.num = num;
        this.den = den;
        simplify();
    }
    int hcf(int a , int b){
        if(a==0) return b ;
         return hcf(b%a,a);
    }
    void simplify(){
boolean isnegative = (num*den<0)?true :false;
num = Math.abs(num);
den = Math.abs(den);
     int gcd = hcf(num,den);
     num = num/gcd;
     den = den/gcd;
    }

    void print() {
        System.out.println(num + "/" + den);
    }

    Fraction2 add(Fraction2 f2) {// we are returning a new fraction
        int newnum = this.num * f2.den + this.den * f2.num;
        int newden = this.den * f2.den;
        return new Fraction2(newnum , newden);
    }

    Fraction2 multiply(Fraction2 f2) {
        int newnum = this.num*f2.num;
        int newden = this.den*f2.den;
        return new Fraction2(newnum , newden);
    }

    public Fraction2 divide(Fraction2 f2) {
        int newnum = this.num*f2.den;
        int newden = this.den*f2.num;
        return new Fraction2(newnum, newden);
    }
}

public class Fraction {
    public static void main(String[] args) {
        Fraction2 f1 = new Fraction2(7, 8);
        Fraction2 f2 = new Fraction2(3, 5);

        System.out.print("Before add: ");
        f1.print(); // 7/8
        f2.print();

         Fraction2 f3= f1.add(f2);
         System.out.print("After add:  ");
         f3.print(); // prints result: (7/8 + 3/5)
        
        //multiply
        Fraction2 f4= f1.multiply(f2);
        System.out.print("After multiplication:  ");
        f4.print();
        // division
        Fraction2 f5 = f1.divide(f2);
        System.out.println("after dicvision =");
        f5.print();

        Fraction2 f7 = new Fraction2(224,20);
        f7.simplify();
        f7.print();
    }
}
