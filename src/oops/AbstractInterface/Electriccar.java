package oops.AbstractInterface;

public class Electriccar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("turn righ");
    }

    @Override
    public void turnLeft() {
        System.out.println("turn left");

    }

    @Override
    public void applyBrakes() {

        System.out.println("brakes applied");
    }
}
