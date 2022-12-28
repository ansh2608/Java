import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char op; Double num1; Double num2; Double ans;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter aa operator (+,-,*,/): ");
        op=sc.next().charAt(0);
        System.out.print("Enter two Numbers: ");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        switch (op){
            case '+':
                ans=num1+num2;
                System.out.print(num1+"+"+num2+"="+ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.print(num1+"-"+num2+"="+ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.print(num1+"*"+num2+"="+ans);
                break;
            case '/':
                ans=num1/num2;
                System.out.print(num1+"/"+num2+"="+ans);
                break;
            default:
                System.out.println("Not an operator");
                break;
        }
    }
}
