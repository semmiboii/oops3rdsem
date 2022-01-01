import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2 ;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        for(int i = num1 ; i<=num2 ; i++){
            if(!prime_check(i)){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
    public static boolean prime_check(int num){
        int flag = 0;
        for(int j = 2; j<=num/2 ; ++j){
            if(num%j==0){
                flag= 1;
                break;
            }
        }
        if(flag==1){
            return false;
        }
        else{
            if (flag == 0) {
                return true;
            }
            else
                return false;
        }
    }
}
