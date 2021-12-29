package btech_1;

import java.util.Scanner;

public class Student {
    int rollNo;
    int subM1;
    int subM2;
    int subM3;
    String name;

    Student(){
        this.rollNo = 0;
        this.name = "";
        this.subM2 = 0;
        this.subM3 = 0;
        this.subM1 = 0;
    }

    Student(String name,int rollNo, int subM1, int subM2, int subM3){
        this.name = name;
        this.rollNo = rollNo;
        this.subM2 = subM1;
        this.subM3 = subM2;
        this.subM1 = subM3;
    }

    void userInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the Student: ");
        this.name = in.next();
        System.out.println("Enter the roll no of the Student: ");
        this.rollNo = in.nextInt();
        System.out.println("Enter 3 sub mark: ");
        this.subM1 = in.nextInt();
        this.subM2 = in.nextInt();
        this.subM3 = in.nextInt();
    }

    void display(){
        System.out.println("----------MARKS----------");
        System.out.println("Sub 1: " + this.subM1);
        System.out.println("Sub 2: " + this.subM2);
        System.out.println("Sub 3: " + this.subM3);
        float total =(this.subM1 + this.subM2 + this.subM3);
        System.out.println("Total: " + total);
        float percentage = (total/300) * 100;
        System.out.println("Percentage: " + percentage);
    }
}

class Test{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.userInput();
        s1.display();
    }
}
