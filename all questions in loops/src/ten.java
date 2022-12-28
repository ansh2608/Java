import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("It is a prime number");
        }
        else
            System.out.println("It is not a prime number");
    }
}
