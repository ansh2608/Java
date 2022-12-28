import java.util.Scanner;

public class Toeplitz_Matrix {
    public static void print_matrix(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void toeplitz(int[][] a,int r1,int c1){
        for (int i=1;i<r1;i++){
            for (int j=1;j<c1;j++){
                if (a[i][j] != a[i-1][j-1]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows of matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of matrix 1: ");
        int c1 = sc.nextInt();
        System.out.println("Enter matrix 1: ");
        int[][] arr1 = new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix: ");
        print_matrix(arr1);
        System.out.println("Transpose matrix of a given matrix: ");
        toeplitz(arr1,r1,c1);
    }
}
