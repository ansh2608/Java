import java.util.Scanner;

public class find {
    public static void find_no(int[][] arr, int x){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==x){
                    System.out.println("Row: "+i);
                    System.out.println("Column: "+j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int r= sc.nextInt();
        System.out.print("Enter number of Column: ");
        int c= sc.nextInt();
        System.out.print("Enter number: ");
        int x= sc.nextInt();
        System.out.println("Enter the matrix: ");
        int[][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        find_no(arr,x);
    }
}
