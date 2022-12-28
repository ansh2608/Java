import java.util.Scanner;

public class prefix_suffix {
    public static void print_array(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean prefix_suffix(int arr[]){
        int total=0;
        int pref=0;
        for (int i=0;i<arr.length;i++){
            total += arr[i];
        }
        for (int i=0;i< arr.length;i++){
            pref += arr[i];
            int suff=total-pref;
            if (suff==pref){
                return true;
            }
        }
        return false;
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
        System.out.println(prefix_suffix(arr));
    }
}
