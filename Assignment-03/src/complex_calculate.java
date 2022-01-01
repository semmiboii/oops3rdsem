import java.util.Scanner;
class Complex{
	int a , b , c ,d;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("first real number ");
		a = sc.nextInt();
		System.out.print("Second real number ");
		c = sc.nextInt();
		System.out.print("first imaginary number ");
		b = sc.nextInt();
		System.out.print("second imaginary number ");
		d = sc.nextInt();
		sum();
	}
	void sum(){
		System.out.print("sum is "+(a+c)+" i"+(b+d));
	
	}
}
public class complex_calculate{
	public static void main(String args[]){
		Complex com = new Complex();
		com.input();
	}
}