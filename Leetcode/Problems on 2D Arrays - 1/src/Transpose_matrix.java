import java.util.Scanner;

public class Transpose_matrix {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int r= sc.nextInt();
        System.out.print("Enter number of Column: ");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Given Array is");
        printarray(arr);
        System.out.println("Transpose of an Array is");
        transpose(arr,c,r);
        printarray(arr);
    }
}
