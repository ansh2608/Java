import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp=sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp=sc.nextInt();
        if(sp>cp){
            int profit=sp-cp;
            System.out.println("Profit: "+profit);
        }
        else{
            int loss=cp-sp;
            System.out.println("Loss: "+loss);
        }
    }
}
