import java.util.Scanner;
public class swaping_with_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int temp;
        System.out.print("Enter the First and Second Number: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.print("Before Swapping the num1= "+num1+"and num2= "+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.print("\nAfter Swapping the variables num1= "+num1+"num2= "+num2);
    }
}
