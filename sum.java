import java.util.Scanner;
public class sum {
    
    public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in);
        //input
        System.out.println("Enter first number= ");
        int num1= scanner.nextInt();

        System.out.println("Enter second number= ");
        int num2 = scanner.nextInt();
        //logic
        int sum = num1+num2;
        System.out.println("sum = "+sum);

        scanner.close();
    }
}
