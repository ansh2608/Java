import java.util.Scanner;

public class printing {
    public static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
        printarray(arr);
    }
}
