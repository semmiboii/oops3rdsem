package Employee_5;

import java.util.Scanner;

class Employee {
  String empName;
  int empId;
  float empSal;
  public void printEmpInfo(){
        System.out.println("The Employee Id is: " + empId);
        System.out.println("The Employee Name is:" + empName);
        System.out.println("The Employee Salary is: " + empSal);
   }
   public void enterInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        empName = in.next();
        System.out.println("Enter the Id: ");
        empId = in.nextInt();
        System.out.println("Enter the Salary is: ");
        empSal = in.nextFloat();
    }
}

class Manager extends Employee{
 float bonus;
 public void enterManagerInfo() {
     Scanner in = new Scanner(System.in);
     super.enterInfo();
     System.out.println("Enter the bonus: ");
     bonus = in.nextFloat();
 }

    public void printManagerInfo(){
     System.out.println("The Manager's Id is: " + empId);
     System.out.println("The Manager's Name is:" + empName);
     System.out.println("The Manager's Salary is: " + empSal);
     System.out.println("The Manager's Bonus is: " + bonus);
 }
}

class Ans5{
 public static void main(String[] args) {
     Manager m = new Manager();
     m.enterManagerInfo();
     m.printManagerInfo();
 }
}
