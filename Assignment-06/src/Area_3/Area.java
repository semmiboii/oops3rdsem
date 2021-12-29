package Area_3;

import java.util.Scanner;

public class Area {
    double a,b,res;
    Area(){
        a=4;
    }
    Area(double a1,double b1){
        a = a1;
        b = b1;
    }
    Area(double r){
        a = r;
    }
    void getArea(double a, double b){
        res = a*b;
        System.out.println("Area of the Rectangle is: " + res);
    }
    void getArea(double r){
        res = 3.14*r*r;
        System.out.println("Area of the Circle is: " + res);
    }
    void getArea(){
        res = a*a;
        System.out.println("Area of the square: " + res);
    }
}

class Ans_3{
    public static void main(String[] args) {
        double x,y,z;
        Scanner in = new Scanner(System.in);
        Area b = new Area();
        System.out.println("Enter the sides of the Rectangle: ");
        b.getArea();
        x = in.nextDouble();
        y = in.nextDouble();
        Area b1 = new Area(x,y);
        b1.getArea(x,y);
        System.out.println("Enter the radius of the circle: ");
        z = in.nextDouble();
        Area b2 = new Area(z);
        b2.getArea(z);
    }
}