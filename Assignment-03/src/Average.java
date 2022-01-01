import java.util.Scanner;
class average{
	int n1 , n2 ,n3;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first num ");
		n1 = sc.nextInt();
		System.out.print("Enter Second num ");
		n2 = sc.nextInt();
		System.out.print("Enter third num ");
		n3 = sc.nextInt();
	}
	void average(){
		int avg = (n1+n2+n3)/3;
		System.out.println("Avrage :"+avg);
	}
}
class driver {
	public static void main(String args[]){
		
		average avg = new average();
		avg.input();
		avg.average();
	}
}