import java.util.Scanner;
public class swapwithoutThridVariable {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter First number= ");
        int num1=scanner.nextInt();

        System.out.println("Enter Second number= ");
        int num2=scanner.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swap: num1= "+num1+",num2= "+num2);
    }
    
}
