import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            if (i != 0){
                System.out.print(" ");
            }
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
