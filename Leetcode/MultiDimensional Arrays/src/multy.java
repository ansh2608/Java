import java.util.Scanner;

public class multy {
    public static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void mul(int a[][],int r1,int c1,int b[][],int r2, int c2){
        int[][] sum=new int[r1][c1];
        if (r2 != c1){
            System.out.print("Wrong Input!- Addition Can't possible");
            return;
        }
        for (int i =0;i<r1;i++){
            for (int j=0;j<c1;j++){
                for (int k=0;k<c2;k++){
                    sum[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        printarray(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows of a matrix 1: ");
        int r1= sc.nextInt();
        System.out.print("Enter number of Column of a matrix 2: ");
        int c1= sc.nextInt();
        int[][] arr=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter number of Rows of a matrix 1: ");
        int r2= sc.nextInt();
        System.out.print("Enter number of Column of a matrix 2: ");
        int c2= sc.nextInt();
        int[][] arr_1=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr_1[i][j]= sc.nextInt();
            }
        }
        mul(arr,r1,c1,arr_1,r2,c2);
    }
}
