import java.util.Scanner;

public class rotate_right {
    public static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] arr,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void rotate(int[][] arr,int n){
        transpose(arr,n,n);
        for (int i=0;i<n;i++){
            for (int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Given Array is");
        printarray(arr);
        System.out.println("Transpose of an Array is");
        rotate(arr,n);
    }
}