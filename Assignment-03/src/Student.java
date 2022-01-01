import java.util.Scanner;
class Student{
	String name;
	int roll_no;
	void students(String nam , int roll){
		name = nam;
		roll_no = roll;
		System.out.print("\nName : "+name);
		System.out.print("\nRoll_no : "+roll_no);
	}
}
class main_class{
	public static void main(String args[]){
		Student std = new Student();
		std.students("Bidur" , 22);
	}
}