package Shape_4;

class Shape {
    public void printShape(){
        System.out.println("This is shape.");
    }
}

class Rectangle extends Shape{
    public void printRectangle() {
        System.out.println("This is a rectangle.");
    }
}

class Circle extends Shape{
    public void printCircle(){
        System.out.println("This is a circle.");
    }
}

class Square extends Rectangle{
    public void printSquare(){
        System.out.println("Square is a rectangle.");
    }
}

class Ans4{
    public static void main(String[] args) {
        Square s = new Square();
        s.printShape();
        s.printRectangle();
    }
}