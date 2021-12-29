package Employee_4;

import java.util.Scanner;

public class Employee {
    int empId;
    String empName, des;

    public Employee(int Id, String Name,String Designation){
        empId = Id;
        empName = Name;
        des = Designation;
    }

    public void printDetails(){
        System.out.println("The EmpInfo.Employee ID is: " + empId);
        System.out.println("The Name of the EmpInfo.Employee is: " + empName);
        System.out.println("The Designation of the EmpInfo.Employee is: " + des);
    }

}

class Ans4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no.of Employees: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Enter the EmpInfo.Employee Id: ");
            int Id = in.nextInt();
            System.out.println("Enter the EmpInfo.Employee Name: ");
            String Name = in.next();
            System.out.println("Enter the EmpInfo.Employee Designation: ");
            String Designation = in.next();
            System.out.println(" ");
            Employee e = new Employee(Id, Name, Designation);
            e.printDetails();
            System.out.println(" ");
        }
    }
}