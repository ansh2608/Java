import java.util.Scanner;

public class Java_Refresher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int ans;
        for (int i=1;i<11;i++){
            ans=n*i;
            System.out.println(n+" x "+i+" = "+ans);
        }
    }
}
