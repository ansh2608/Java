import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a Number: ");
        int m=sc.nextInt();
        Arrays.sort(arr);
        int count=0;
        for (int i=0;i<m;i++){
            count+=arr[i];
        }
        int ans=0;
        for (int i=m;i<n;i++){
            ans+=arr[i];
        }
        System.out.println(ans-count);
    }
}
