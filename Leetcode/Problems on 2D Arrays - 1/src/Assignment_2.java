import java.util.Scanner;

public class Assignment_2 {
    public static void print_matrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] arr,int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n-i-1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][n-i-1];
                arr[j][n-i-1]=arr[n-i-1][n-j-1];
                arr[n-i-1][n-j-1]=arr[n-j-1][i];
                arr[n-j-1][i]=temp;
            }
        }
        print_matrix(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of a matrix 1");
        int n=sc.nextInt();
        System.out.println("Enter a matrix");
        int[][] a=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]= sc.nextInt();
            }
        }
        rotate(a,n);
    }
}