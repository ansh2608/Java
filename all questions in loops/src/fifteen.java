import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        while(num>0){
            int rmndr=num%10;
            count= count*10+rmndr;
            num =num/10;
        }
        System.out.println(count);
    }
}
