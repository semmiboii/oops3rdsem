import java.util.Scanner;
import java.lang.Math;

public class armstrong_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , realnum , rem , cal = 0 , digits=0;
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        realnum = num;
        while(num!=0){
            num = num/10;
            digits++;
        }
        num = realnum;
        while(num!=0){
            rem = num%10;
            cal = (int) (cal + Math.pow(rem,digits));
            num/=10;
        }
        if(cal == realnum){
            System.out.println("The Number is Armstrong Number");
        }
        else{
            System.out.println("The Number is not an Armstrong Number");
        }
    }
}
