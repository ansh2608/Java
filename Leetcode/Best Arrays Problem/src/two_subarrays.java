import java.util.Scanner;

public class two_subarrays {
    public static int[] prefix_array(int arr[]){
        for (int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total_sum=0;
        for (int i=0;i<n;i++){

        }
        prefix_array(arr);

    }
}
