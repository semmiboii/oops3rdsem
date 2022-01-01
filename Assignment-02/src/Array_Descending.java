import java.util.Arrays;
import java.util.Scanner;

public class Array_Descending {
    static void  printing(int array[] , int size){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size: ");
        int size = sc.nextInt();
        int array[] = new int[size] , element;
        System.out.print("Enter Elements: ");
        for(int i = 0 ; i<size ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        System.out.println("Original");
        printing(array,size);
        Arrays.sort(array);
        int temp;
        for(int i = 0 ; i<size/2 ; i++){
            temp = array[size-1-i];
            array[size-1-i] = array[i];
            array [i] = temp;
        }
        System.out.println("Updated");
        printing(array,size);
    }
}
