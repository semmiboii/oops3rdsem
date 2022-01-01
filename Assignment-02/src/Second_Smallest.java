import java.util.Arrays;
import java.util.Scanner;

public class Second_Smallest {
    static void  printing(int array[] , int size){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" "+array[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int array[] = new int[size] , element ,smallest ;
        System.out.print("Enter elements: ");
        for(int i = 0 ; i<size ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        int second = smallest = 0;
        System.out.print("Elements are: ");
        printing(array , size);
        Arrays.sort(array);
        System.out.println("Second Smallest is: "+array[1]);
    }
}