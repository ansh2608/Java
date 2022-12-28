import java.util.Scanner;

public class fortee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=1;
        for (int i=1;i<=num;i++){
            count += num%10;
            num = num/10;
        }
        System.out.println(count);
    }
}
