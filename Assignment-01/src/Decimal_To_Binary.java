import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , rem , binary=0 , i =0;
		System.out.print("Enter the decimal number : ");
        num = sc.nextInt();
        while(num!=0){
            rem = num%2;
            binary = (int) (binary + rem*Math.pow(10,i));
            num= num/2;
            i++;
        }
        System.out.println("Binary : "+binary);
    }
}