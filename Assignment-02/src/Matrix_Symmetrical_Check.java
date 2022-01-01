import java.util.Scanner;

public class Matrix_Symmetrical_Check {
    public static void print_matrix(int [][] matrix , int r1 , int c1 ){
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] matrix_form(int r , int c){
        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);
        int matrix[][] =new int[r][c] ;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static boolean symmetric_check(int[][] matrix , int[][] transpose ,int r , int c){
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                if(transpose[i][j] == matrix[i][j]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] transpose_create(int[][] matrix , int r , int c){
        Scanner sc = new Scanner(System.in);
        int transpose[][] =new int[c][r] ;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = matrix_form(row,col);
        System.out.println("The Original is- ");
        print_matrix(matrix,row,col);
        if(row!=col){
            System.out.println("Not Symmetrical is- ");
        }else{
            int[][] transpose = transpose_create(matrix,row,col);
            if(!symmetric_check(matrix,transpose,row,col)){
                System.out.println("Non Symmetrical matrix !!!");
            }else{
                System.out.println("Symmetrical matrix !!!");
            }
        }
    }
}
