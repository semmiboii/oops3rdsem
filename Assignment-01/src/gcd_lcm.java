import java.util.Scanner;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,gcd,lcm,rem,num11, num22;
        System.out.println("Enter Two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num11 = num1;
        num22= num2;
        rem=num1/num2;
        while(num1!=num2){
            if(num1>num2){
                num1 -= num2;
            }
            else{
                num2 -=num1;
            }
        }
        gcd= num1;
        lcm=(num11*num22)/gcd;
        System.out.println("GCD= "+gcd);
        System.out.printf("LCM= "+lcm);
    }
}