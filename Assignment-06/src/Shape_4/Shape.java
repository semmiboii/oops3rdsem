package Shape_4;

abstract class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}

class Ans_4{
    public static void main(String[] args) {
        Shape ob;
        ob = new Circle();
        ob.draw();
        ob.erase();
        ob = new Triangle();
        ob.draw();
        ob.erase();
        ob = new Square();
        ob.draw();
        ob.erase();

    }
}