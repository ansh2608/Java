import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        do{
            sum += i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}
