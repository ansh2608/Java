import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        int l=sc.nextInt();
        System.out.print("Enter breadth: ");
        int b=sc.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is a rectangle");
        }
    }
}