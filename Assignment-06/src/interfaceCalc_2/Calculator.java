package interfaceCalc_2;

public interface Calculator {
    double num1 = 10, num2 = 5;
    void add();
    void sub();
    void mul();
    void div();
}

class DemoCalculator implements Calculator{
    double res;
    public void add(){
        res = num1 + num2;
        System.out.println("The Sum is: " + res);
    }
    public void sub(){
        res = num1 - num2;
        System.out.println("The Difference is: " + res);
    }
    public void mul(){
        res = num1*num2;
        System.out.println("The Product is: " + res);
    }
    public void div(){
        res = num1/num2;
        System.out.println("The Result is: " + res);
    }
}

class Ans_2{
    public static void main(String[] args) {
        Calculator ob;
        ob = new DemoCalculator();
        ob.add();
        ob.sub();
        ob.mul();
        ob.div();
    }
}