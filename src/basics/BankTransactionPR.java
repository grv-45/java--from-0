package basics;

//You are given N bank transactions.
//Each transaction has:
//Sender Receiver Amount Timestamp
//A transaction is considered fraud if:
//        • Sender, Receiver, and Amount are same
//• Timestamp difference ≤ 60 seconds
//

import java.util.Scanner;

class Transaction{
    String Sender;
    String reciver;
    Double Amount;
    Long TimeStamp;

    public Transaction(String sender, String reciver, Double amount, Long timeStamp) {
        Sender = sender;
        this.reciver = reciver;
        Amount = amount;
        TimeStamp = timeStamp;
    }
}
public class BankTransactionPR {
    public static void main(String[] args) {
      //  Transaction T1 = new Transaction("Gourav","Sahil",50000.00,70);
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());// number of transactions




    }
}
