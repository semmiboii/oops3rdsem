package Rectangle_3;

import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area(){
        System.out.println(length*breadth);
    }
    public void perimeter(){
        System.out.println(2*(length + breadth));
    }
}

class Square extends Rectangle{
    int side;
    public Square(int s){
        super(s,s);
    }
}

class Ans3{
    public static void main(String[] args) {
        int len;
        int bre;
        int side;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        len= in.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        bre= in.nextInt();
        Rectangle r = new Rectangle(len, bre);
        r.area();
        r.perimeter();

        System.out.println("Enter the side of the square: ");
        side = in.nextInt();
        Square s = new Square(side);
        s.area();
        s.perimeter();
    }
}