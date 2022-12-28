import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age<12){
            System.out.println("You are child");
        }
        else if (age>=12 && age<18) {
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are an adult");
        }
    }
}
