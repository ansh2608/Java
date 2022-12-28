import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zeroes=0;
        int ones=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zeroes ++;
            }
            else {
                ones ++;
            }
        }
        int diff;
        if (ones>zeroes){
            diff=ones/zeroes;
        }
        else {
            diff=zeroes/ones;
        }
        System.out.println(diff);
    }
}
