import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num<0){
            num=num*-1;
        }
        System.out.print("Your number: "+num);
    }
}