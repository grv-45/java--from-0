package oops.Abstractclass;

  public class savingsacc extends  BankAcc {


      @Override
      public void deposit(double amount) {
          System.out.println("Deposited");

      }

      @Override
      public void withdraw(double amount) {
          System.out.println("withdrawen");

      }
  }
