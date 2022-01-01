import java.util.Scanner;

public class Multiplication_Table {
    public static void print_matrix(int [][] matrix  ){
        for(int i=0; i<10; i++){
            for(int j=0; j<3; j++){
                if(j==1){
                    System.out.print("\t * \t"+matrix[i][j]);
                }else if(j==2){
                    System.out.print("\t = \t"+matrix[i][j]);
                }else{
                    System.out.print("\t"+matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to get multiplication table: ");
        int num = sc.nextInt();
        int matrix[][] =new int[10][3] ;
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0; j < 3 ; j++){
                if(j==0){
                    matrix[i][j]=i+1;
                }else if(j==1){
                    matrix[i][j] = num;
                }else{
                    matrix[i][j] = (i+1)*num;
                }
            }
        }
        print_matrix(matrix);
    }
}
