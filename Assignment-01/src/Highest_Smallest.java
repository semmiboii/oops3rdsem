import java.util.Scanner;

public class Highest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total numbers: ");
        int size = sc.nextInt();
        int small=0 , large = 0 , num;
        for(int i=0; i<size ; i++){
            num = sc.nextInt();
            if(num>large){
                large = num;
            }
            if(num<small || small == 0){
                small = num;
            }
        }
        System.out.println("The Largest is "+large+" Smallest is "+small);
    }
}