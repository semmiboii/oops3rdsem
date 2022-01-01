import java.util.Scanner;

public class Swapping_without_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before Swapping A= "+num1+" B= "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping A= "+num1+" B= "+num2);
    }
}