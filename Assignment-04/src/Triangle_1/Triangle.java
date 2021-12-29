package Triangle_1;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Triangle{
    int a,b,c;

    public Triangle(int s1,int s2,int s3){
        a = s1;
        b = s2;
        c = s3;
    }

    public double printPerimeter(){
        return (a + b + c)/2.0;
    }

    public double printArea(){
        double s = (a + b + c)/2.0;
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }

}

class Ans1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle: ");
        int side1 = in.nextInt();
        System.out.println("Enter the 2nd side of the triangle: ");
        int side2 = in.nextInt();
        System.out.println("Enter the 3rd side of the triangle: ");
        int side3 = in.nextInt();
        Triangle t = new Triangle(side1,side2,side3);
        System.out.println(t.printPerimeter());
        System.out.println(t.printArea());
    }
}
