import java.util.Scanner;

public class Array_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int array[] = new int[size] , num , count = 0 , find_num;
        System.out.print("\nEnter the elements of array : ");
        for(int i = 0 ; i< size ; i++){
            num = sc.nextInt();
            array[i] = num;
        }
        int flag = 0;
        for(int i = 0 ; i<= size/2 ; i++){
            if(array[i] == array[size-1-i]){
                flag = 1;
            }else{
                flag = 0;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Array is not a palindrome");
        }else{
            System.out.println("Array is a palindrome");
        }
    }
}