import java.util.Scanner;

class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate Volume of a Sphere");
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();

        // Formula: Volume = (4/3) * π * r³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("Volume of Sphere = " + volume);


        // Math.pow(r,3) => r³
        // Math.PI => value of π (3.14159...)
        // (4.0/3.0) likha taaki division double me ho
    }
}
