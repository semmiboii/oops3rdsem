import java.util.Scanner;

public class Array_Insert {
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
        size++;
        int array[] = new int[size] , element;
        System.out.print("Enter elements: ");
        for(int i = 0 ; i<size-1 ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        System.out.println("Outdated");
        printing(array,size-1);
        System.out.print("Enter the index you want to input : ");
        int index = sc.nextInt();
        System.out.print("Enter the element: ");
        int ele = sc.nextInt();
        if(index > size || index<0){
            System.out.print("Index doesn't exist. ");
        }else{
            for(int i = size-2 ; i>=index-1 ; i--){
                array[i+1] = array[i];
            }
            array[index-1]= ele;
        }
        System.out.println("Updated");
        printing(array, size);
    }
}
