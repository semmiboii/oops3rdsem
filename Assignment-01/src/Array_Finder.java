import java.util.Scanner;

public class Array_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int array[] = new int[size] , num , count = 0 , find_num;
        System.out.print("\nEnter the elements of array : ");
        for(int i = 0 ; i< size ; i++){
            num = sc.nextInt();
            array[i] = num;
        }
        System.out.print("\nEnter the number to find and its frequency : ");
        find_num = sc.nextInt();
        for(int i = 0 ; i< size ; i++){
            if(array[i]==find_num){
                System.out.println("Your "+find_num+" is Found at "+(i+1));
                count++;
            }
        }
        if(count>0){
            System.out.println("The frequency is "+count);
        }else{
            System.out.println(find_num+" is not found");
        }
    }
}
