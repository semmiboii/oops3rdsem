import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first matrix");
        System.out.print("Enter the number of rows ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns ");
        int c1 = sc.nextInt();
        int[][] matrix1 = matrix_form(r1,c1);
        print_matrix(matrix1,r1,c1);
        System.out.println("Enter the second matrix");
        System.out.print("Enter the number of rows ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns ");
        int c2 = sc.nextInt();
        int[][] matrix2 = matrix_form(r2,c2);
        print_matrix(matrix2,r2,c2);
        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible");
        }
        else{
            matrix_multiplication(matrix1,r1,c1,matrix2,r2,c2);
        }
    }
    public static int[][] matrix_form(int r , int c){
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        int matrix[][] =new int[r][c] ;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void matrix_multiplication(int[][] matrix1, int r1 , int c1 , int[][] matrix2 , int r2 , int c2){
        int[][] matrix = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                matrix[i][j] = 0;
                for(int k=0; k<c1; k++){
                    matrix[i][j] = matrix[i][j] +(matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        System.out.println("After Multiplication");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                System.out.print("\t "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void print_matrix(int [][] matrix , int r1 , int c1 ){
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }
    }
}