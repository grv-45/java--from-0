package oops.Abstractclass;

public class currentacc extends BankAcc{

    @Override
    public void deposit(double amount) {
        System.out.println("Desposited");

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("withdrawn");
    }
}
