import java.util.Scanner;

public class prefix_sum {
    public static void print_array(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefix(int arr[]){
        for (int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        print_array(arr);
        System.out.print("The sum of given array: ");
        int[] ans=prefix(arr);
        print_array(ans);
    }
}
