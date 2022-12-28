import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("The number is negative and skipped");
        }
        else{
            System.out.println("You entered: "+num);
        }
    }
}
