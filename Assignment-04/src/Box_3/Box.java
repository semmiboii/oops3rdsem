package Box_3;

import java.util.Scanner;

public class Box {
    double width,height,depth;

//    Constructor Off
    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }


    public double volume(){
        return width*height*depth;
    }

    public void printVolume(){
        System.out.println("The Volume of the box is: ");
        System.out.println(volume());
    }
}

class Ans3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the box: ");
        double width = in.nextDouble();
        System.out.println("Enter the height of the box: ");
        double height = in.nextDouble();
        System.out.println("Enter the depth of the box: ");
        double depth = in.nextDouble();
        Box b = new Box(width,height,depth);
        b.printVolume();
    }
}
