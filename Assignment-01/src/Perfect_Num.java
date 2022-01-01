import java.util.Scanner;

public class Perfect_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int rem, sum=0;
        for(int i = 1 ; i<num ; i++){
            rem= num%i;
            if(rem==0){
                sum = sum+i;
            }
        }
        if(sum == num){
            System.out.println(num+" is a Perfect number.");
        }else{
            System.out.println(num+" is not a Perfect number.");
        }
    }
}
