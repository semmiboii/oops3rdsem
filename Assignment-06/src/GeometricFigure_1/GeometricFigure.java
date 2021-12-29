package GeometricFigure_1;

abstract class GeometricFigure{
    double dim1 = 4;
    double dim2 = 8;
    abstract void getArea();
}

class Rectangle extends GeometricFigure{
    void getArea(){
        double area;
        area = dim1*dim2;
        System.out.println("The Area of the rectangle is: " + area);
    }
}

class Triangle extends GeometricFigure{
    void getArea(){
        double area;
        area = .5*dim1*dim2;
        System.out.println("The Area of the Rectangle is: " + area);
    }
}

class Ans_1{
    public static void main(String[] args) {
        GeometricFigure ob;
        ob = new Rectangle();
        ob.getArea();
        ob = new Triangle();
        ob.getArea();
    }
}