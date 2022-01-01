import java.util.Scanner;

public class Array_Largest_Smallest {
    static void  printing(int array[] , int size){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" "+array[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int array[] = new int[size] , element , largest = 0 , smallest = 0;
        System.out.print("Enter elements : ");
        for(int i = 0 ; i<size ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        System.out.print("Elements are : ");
        printing(array , size);
        for(int i=0; i<size ; i++){
            if(array[i]>largest){
                largest = array[i];
            }
            if(array[i]<smallest || smallest == 0){
                smallest = array[i];
            }
        }
        System.out.println("Smallest element is "+smallest);
        System.out.println("Largest element is "+largest);
    }
}
