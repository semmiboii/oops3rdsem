package Student_5;

import java.util.Scanner;

public class Student {
    int regNo;
    String stdName;
    String branch;
    float stCGPA;

    public Student(){
        System.out.println("This is a default constructor");
    }

    public Student(int regId, String Name, String Branch, float CGPA ){
        regNo = regId;
        stdName = Name;
        branch = Branch;
        stCGPA = CGPA;
    }

    public void printDetails(){
        System.out.println("The Student Registration ID is: " + regNo);
        System.out.println("The Standard Name is: " + stdName);
        System.out.println("The Branch Name is: " + branch);
        System.out.println("The CGPA of the student is: " + stCGPA);
    }
}

class Ans5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no.of the students: ");
        int n = in.nextInt();
        System.out.println(" ");
        for (int i=0; i<n; i++){
            System.out.println("Enter the name of the student: ");
            String name = in.next();
            System.out.println("Enter the Registration No of the Student: ");
            int Id = in.nextInt();
            System.out.println("Enter the Branch of the Student: ");
            String Branch = in.next();
            System.out.println("Enter the CGPA of the Student: ");
            float CGPA = in.nextFloat();
            System.out.println("  ");
            Student s = new Student(Id, name, Branch, CGPA);
            s.printDetails();
            System.out.println("  ");
        }
    }
}