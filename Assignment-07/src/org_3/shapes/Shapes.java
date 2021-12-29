package org_3.shapes;

import java.util.Scanner;

class Triangle{
    float s1,s2,s3;
    double p,s,a;

    Triangle(){
        this.s1 = 0;
        this.s2 = 0;
        this.s3 = 0;
    }

    void perimeter(){
        p = (s1 + s2 + s3);
        System.out.println("The Perimeter of the Triangle is:" + p);
    }

    void area(){
        s = (s1 + s2 + s3)/2;
        a = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The Area of the Triangle is:" + a);
    }
}

class Square{
    float s;
    double p,a;

    Square(){
        this.s = 0;
    }

    void perimeter(){
        p = 4*s;
        System.out.println("The Perimeter of the Square is:" + p);
    }

    void area(){
        a = s*s;
        System.out.println("The Area of the Square is:" + a);
    }
}

class Circle{
    float r;
    double c,a;

    Circle(){
        this.r = 0;
    }

    void perimeter(){
        c = 2 * 3.14 * r;
        System.out.println("The Circumference of the Circle is: " + c);
    }

    void area(){
        a = 3.14 * r * r;
        System.out.println("The Area of the Circle is: " + a);
    }
}

class Rectangle{
    float l,b;
    double p,a;

    Rectangle(){
        this.l = 0;
        this.b = 0;
    }

    void perimeter(){
        p = 2 * (l + b);
        System.out.println("The Perimeter of the Rectangle is:" + p);
    }

    void area(){
        a = l * b;
        System.out.println("The Area of the Rectangle is: " + a);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 For Triangle");
        System.out.println("Enter 2 For Square");
        System.out.println("Enter 3 For Circle");
        System.out.println("Enter 4 For Rectangle");
        System.out.println("Enter a choice: ");
        int a = in.nextInt();
        switch(a){
            case 1:
                Triangle t = new Triangle();
                System.out.println("Enter the length of 1st side: ");
                t.s1 = in.nextFloat();
                System.out.println("Enter the length of 2nd side: ");
                t.s2 = in.nextFloat();
                System.out.println("Enter the length of 3rd side: ");
                t.s3 = in.nextFloat();
                System.out.println("Enter 1 to print Perimeter of the Triangle");
                System.out.println("Enter 2 to print Area of the Triangle");
                System.out.println("Enter 3 to print both the perimeter and the area of the triangle");
                System.out.println("Enter your choice: ");
                int z = in.nextInt();
                switch(z){
                    case 1 -> t.perimeter();
                    case 2 -> t.area();
                    case 3 -> {
                        t.perimeter();
                        t.area();
                    }
                    default -> System.out.println("Invalid Choice!");
                }
                break;
            case 2:
                Square s = new Square();
                System.out.println("Enter the side of the square: ");
                s.s = in.nextFloat();
                System.out.println("Enter 1 to Print The Perimeter Of The Square");
                System.out.println("Enter 2 to Print The Area Of The Square");
                System.out.println("Enter 3 to Print Both The Perimeter And Area of The Square");
                System.out.println("Enter your choice: ");
                int z1 = in.nextInt();
                switch(z1){
                    case 1 -> s.perimeter();
                    case 2 -> s.area();
                    case 3 -> {
                        s.perimeter();
                        s.area();
                    }
                    default -> System.out.println("Invalid Choice!");
                }
                break;
            case 3:
                Circle c = new Circle();
                System.out.println("Enter the Radius of The Circle: ");
                c.r = in.nextFloat();
                System.out.println("Enter 1 To Print The Circumference of The Circle: ");
                System.out.println("Enter 2 To Print The Area of The Circle: ");
                System.out.println("Enter 3 To Print Both The Area and Perimeter of The Circle: ");
                System.out.println("Enter your choice: ");
                int z2 = in.nextInt();
                switch (z2) {
                    case 1 -> c.perimeter();
                    case 2 -> c.area();
                    case 3 -> {
                        c.perimeter();
                        c.area();
                    }
                    default -> System.out.println("Invalid Choice!");
                }
                break;
            case 4:
                Rectangle r = new Rectangle();
                System.out.println("Enter the Length of The Rectangle: ");
                r.l = in.nextFloat();
                System.out.println("Enter the Breadth of The Rectangle: ");
                r.b = in.nextFloat();
                if (r.l > r.b){
                    System.out.println("Enter 1 to Print The Perimeter Of The Rectangle");
                    System.out.println("Enter 2 to Print The Area Of The Rectangle");
                    System.out.println("Enter 3 to Print Both The Perimeter and Area Of The Rectangle");
                    System.out.println("Enter your choice: ");
                    int z3 = in.nextInt();
                    switch (z3){
                        case 1 -> r.perimeter();
                        case 2 -> r.area();
                        case 3 -> {
                            r.perimeter();
                            r.area();
                        }
                        default -> System.out.println("Invalid Choice");
                    }
                }else{
                    System.out.println("Length Of The Rectangle is Less Than It's Breadth.");
                }
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}