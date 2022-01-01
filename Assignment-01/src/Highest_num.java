import java.util.Scanner;

public class Highest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int temp2 = 0 , rem;
        while(temp!=0){
            rem = temp%10;
            if(temp2<rem){
                temp2 = rem;
            }
            temp /=10;
        }
        System.out.println("The Highest number of your number "+num+" is "+temp2);
    }
}
