import java.util.Scanner;

public class Half_Square_Zero {
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
    public static void print_matrix(int [][] matrix , int r1 , int c1 ){
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int col = sc.nextInt();
        int[][] matrix = matrix_form(row,col);
        System.out.println("The Original is: ");
        print_matrix(matrix,row,col);
        if(row==col && row%2==0 && col%2==0){
            for(int i = 0 ; i < row/2 ; i++){
                for(int j = 0; j < col ; j++){
                    matrix[i][j] = 0;
                }
            }
            System.out.println("Updated one");
            print_matrix(matrix,row,col);
        }else{
            System.out.println("It's not a square matrix");
        }
        
    }
}
