package btech_1.arithmetic_2;

import java.util.Scanner;

public class MyMath {
    int n1,n2;

    MyMath(){
        this.n1 = 0;
        this.n2 = 0;
    }

    MyMath(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    void add(int n1,int n2){
        System.out.println(n1 + n2);
    }
    void subtract(int n1,int n2){
        System.out.println(n1 - n2);
    }
    void multiply(int n1,int n2){
        System.out.println(n1 * n2);
    }
    void divide(int n1,int n2){
        System.out.println(n1 / n2);
    }
    void mod(int n1,int n2){
        System.out.println(n1 % n2);
    }

}
class Test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyMath m = new MyMath();
        System.out.println("Enter 1st Number");
        m.n1 = in.nextInt();
        System.out.println("Enter 2nd Number");
        m.n2 = in.nextInt();
        System.out.println("Enter 1 to Add -");
        System.out.println("Enter 2 to Subtract -");
        System.out.println("Enter 3 to Multiply -");
        System.out.println("Enter 4 to Divide -");
        System.out.println("Enter 5 to Mod -");
        System.out.println("Enter a choice: ");
        int a = in.nextInt();
        if (a <= 5){
            switch (a) {
                case 1 -> m.add(m.n1, m.n2);
                case 2 -> m.subtract(m.n1, m.n2);
                case 3 -> m.multiply(m.n1, m.n2);
                case 4 -> m.divide(m.n1, m.n2);
                case 5 -> m.mod(m.n1, m.n2);
                default -> {
                System.out.println("Invalid Choice!");
                }
            }
        }else{
            System.out.println("Enter a valid choice:");
        }
    }
}
