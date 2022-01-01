import java.util.Scanner;
class Employeee{
	String name , year , address;
	int salary;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name ");
		name = sc.nextLine();
		System.out.print("year ");
		year = sc.nextLine();
		System.out.print("salary ");
		salary = sc.nextInt();
		System.out.print("address ");
		sc.nextLine();
		address = sc.nextLine();
		print();
	}
	void print(){
		System.out.println("Name "+name);
		System.out.println("salary "+salary);
		System.out.println("year "+year);
		System.out.println("address "+address);
	}
}
class emp_print{
	public static void main(String args[]){
		Employeee emp = new Employeee();
		emp.input();
		emp.input();
		emp.input();
	}
}