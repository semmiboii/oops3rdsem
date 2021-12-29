package Parent_1;

class ParentClass{
    public void parentmethod(){
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass{
    public void childmethod(){
        System.out.println("This is child class.");
    }
}

class Ans1{
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ChildClass c = new ChildClass();
        p.parentmethod();
        c.childmethod();
        p.parentmethod();
    }
}