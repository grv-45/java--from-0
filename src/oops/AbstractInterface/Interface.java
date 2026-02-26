package oops.AbstractInterface;
//Interface bhi abstract hota hai
//Ye ek blueprint hota hai jisme mostly abstract methods hote hain.
//⚡ Interface ko class implements karti hai (extends nahi).
public class Interface {


    public static void main(String[] args) {
        Electriccar E1 = new Electriccar();
        E1.applyBrakes();
        E1.turnLeft();
        E1.turnRight();


        System.out.println("team b =");
        CarControls mycar= new Electriccar();
        mycar.applyBrakes();
        mycar.applyBrakes();
        mycar.turnLeft();
        mycar.turnRight();
    }
}
