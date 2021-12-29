package BankAcc_6;

import java.util.Scanner;

public class BankAcc {
    String name;
    int accNo;
    float bal;

    public BankAcc(String accHolderName, int accNumber, float balance){
        name = accHolderName;
        bal = balance;
        accNo = accNumber;
    }

    public void printAccInfo(){
        System.out.println("The Account Holder Name Is: " + name);
        System.out.println("The Account Number of the Holder is: " + accNo);
        System.out.println("The Account Balance is: " + bal);
    }

    public double deposit(float depositAmount){
        return (bal + depositAmount);
    }
    public double withdraw(float withdrawAmount){
        return (bal - withdrawAmount);
    }
}

class Ans6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the account holder name: ");
        String name = in.next();
        System.out.println("Enter the account no: ");
        int accNo = in.nextInt();
        System.out.println("Enter the Account Balance: ");
        float bal = in.nextFloat();
        BankAcc b = new BankAcc(name, accNo, bal);
        System.out.println(" ");
        System.out.println("Press 1 to Deposit.");
        System.out.println("Press 2 to Withdraw.");
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("Enter the amount to be deposited.");
            float deposit = in.nextFloat();
            System.out.println("The New Amount is: " + b.deposit(deposit));
        } else {
            System.out.println("Enter the amount to be withdrawn.");
            float withdraw = in.nextFloat();
            System.out.println("The New Amount is: " + b.withdraw(withdraw));
        }
    }
}