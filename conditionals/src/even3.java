import java.util.Scanner;

public class even3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0&&num%3==0){
            System.out.println("Number is even and divisible by 3");
        }
        else{
            System.out.println("Number is odd and divisible by 3");
        }
    }
}
