import java.util.Scanner;

public class Array_Update_Index {
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
        int array[] = new int[size] , element;
        System.out.print("Enter elements : ");
        for(int i = 0 ; i<size ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        System.out.println("Outdated ");
        printing(array,size);
        System.out.print("Enter the index you want to input : ");
        int index = sc.nextInt();
        System.out.print("Enter the element : ");
        int ele = sc.nextInt();
        if(index > size){
            System.out.print("Index doesn't exist. ");
        }else{
            int counter = 0;
            for(int i = 0 ; i<index-1 ; i++){
                counter++;
            }
            array[counter] = ele;
        }
        System.out.println("Updated ");
        printing(array, size);
    }
}
