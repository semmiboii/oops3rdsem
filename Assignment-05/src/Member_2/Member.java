package Member_2;

import java.util.*;

class Member {
    String name;
    int age;
    String phone;
    String address;
    float salary;
    public void printSalary(){
        System.out.println(salary);
    }
}

class Employee extends Member{
    String specialization;
}

class Manager extends Member{
    String department;
}

class Ans2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employee e = new Employee();
        System.out.println("Enter the name of the Member_2.Employee: ");
        e.name = in.next();
        System.out.println("Enter the Age of the Member_2.Employee: ");
        e.age = in.nextInt();
        System.out.println("Enter the Phone Number of the Member_2.Employee: ");
        e.phone = in.next();
        System.out.println("Enter the Address of the Member_2.Employee: ");
        e.address = in.next();
        System.out.println("Enter the Salary of the Member_2.Employee: ");
        e.salary = in.nextFloat();
        System.out.println("\n");
        Manager m = new Manager();
        System.out.println("Enter the name of the Member_2.Manager: ");
        m.name = in.next();
        System.out.println("Enter the Age of the Member_2.Manager: ");
        m.age = in.nextInt();
        System.out.println("Enter the Phone Number of the Member_2.Manager: ");
        m.phone = in.next();
        System.out.println("Enter the Address of the Member_2.Manager: ");
        m.address = in.next();
        System.out.println("Enter the Salary of the Member_2.Manager: ");
        m.salary = in.nextFloat();
    }
}