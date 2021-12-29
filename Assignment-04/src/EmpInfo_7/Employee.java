package EmpInfo_7;

import java.util.Scanner;

public class Employee {
    int empNo;
    String empName;
    float basicSal,da,hra,grossSal;

    public Employee(){
        System.out.println("Enter the Employee Details.");
        System.out.println(" ");
    }

    public Employee(String name, int id, float sal){
        empNo = id;
        empName = name;
        basicSal = sal;
    }

    public float calGrossSal(){
        da = (float) (0.2 * basicSal);
        hra = (float) (0.1 * basicSal);
        grossSal = basicSal+hra+da;
        return (grossSal);
    }

    public void showEmpDetails(){
        System.out.println("The Employee No. is: " + empNo);
        System.out.println("The Employee Name is: " + empName);
        System.out.println("The Employee Salary is: " + calGrossSal());
    }
}

class Ans7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter the name of the Employee: ");
        e.empName = in.next();
        System.out.println("Enter the Employee Id: ");
        e.empNo = in.nextInt();
        System.out.println("Enter the Employee Basic Salary: ");
        e.basicSal = in.nextFloat();
        System.out.println(" ");
        e.showEmpDetails();
    }
}
