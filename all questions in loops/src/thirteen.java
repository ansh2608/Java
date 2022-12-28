import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=1;
        for (int i=1;i<=num;i++){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
