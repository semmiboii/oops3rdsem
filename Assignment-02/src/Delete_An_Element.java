import java.util.Scanner;

public class Delete_An_Element {
    static void  printing(int array[] , int size){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" "+array[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        int array[] = new int[size] , element;
        System.out.print("Enter Elements: ");
        for(int i = 0 ; i<size ; i++){
            element = sc.nextInt();
            array[i] = element;
        }
        System.out.println("Outdated");
        printing(array,size);
        System.out.print("Enter the position you want to delete : ");
        int pos = sc.nextInt();
        if(pos<0 || pos>size-1){
            System.out.print("Wrong Position Input");
        }else{
            for(int i =pos-1 ; i<size-1 ; i++ ){
                array[i] = array[i+1];
            }
        }
        size = size-1;
        System.out.println("Updated");
        printing(array, size);
    }
}