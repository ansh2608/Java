import java.util.Scanner;

public class maximum_value {
    public static void print_array(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int maximum(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
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
        System.out.print("The maximum value of given array: ");
        System.out.print(maximum(arr));
    }
}
