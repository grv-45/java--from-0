package oops.Abstractclass;

//Abstract class ek aisi class hoti hai jo abstract keyword se declare hoti hai aur:
//👉 Isme abstract methods (without body) bhi ho sakte hain
//👉 Aur normal methods (with body) bhi ho sakte hain

public class abstractclass {


    public static void main(String[] args) {
    savingsacc savingsacc = new savingsacc();
    savingsacc.deposit(4000);

    currentacc bankAcc = new currentacc();
    bankAcc.deposit(897897);

            BankAcc savings = new currentacc();
        savings.withdraw(4000);
    }
}
