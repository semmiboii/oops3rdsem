package ComplexNum_8;

import java.util.Scanner;

public class ComplexNum {
    int real;
    int img;
    public ComplexNum(){}

    public ComplexNum(int real ,int img){
        this.real = real;
        this.img = img;
    }

    public void displayCompNumber(){
        System.out.println(real + " + " + img + "i");
    }

    public static ComplexNum addCompNumber(ComplexNum c1, ComplexNum c2){
        ComplexNum temp  = new ComplexNum(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ComplexNum c1 = new ComplexNum();
        System.out.println("Enter the first real number: ");
        c1.real = in.nextInt();
        System.out.println("Enter the first imaginary number: ");
        c1.img = in.nextInt();
        System.out.println(" ");
        ComplexNum c2 = new ComplexNum();
        System.out.println("Enter the second real number: ");
        c2.real = in.nextInt();
        System.out.println("Enter the second imaginary number: ");
        c2.img = in.nextInt();
        System.out.println(" ");
        ComplexNum temp = addCompNumber(c1,c2);
        temp.displayCompNumber();
    }
}
