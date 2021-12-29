package Rectangle_2;

import java.util.Scanner;

public class Rectangle {
    int l;
    int b;

    public Rectangle(int length, int breadth){
        l = length;
        b = breadth;
    }

    public double area(){
        return l*b;
    }
}

class Ans2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        int length = in.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
        int breadth = in.nextInt();
        if (length < breadth){
            System.out.println("The Length cannot be less than the breadth.");
        }else{
            Rectangle r = new Rectangle(length, breadth);
            System.out.println("The Area of the Rectangle is: " + r.area());
        }
    }
}