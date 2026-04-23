import java.util.Scanner;
public class QuotientandRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Divided number= ");
        int num1=scanner.nextInt();

        System.out.println("Enter Divisor number= ");
        int num2=scanner.nextInt();

        int quotient=num1/num2;
        int remainder=num1%num2;

        System.out.println("Quotient= "+quotient);
        System.out.println("Remainder= "+remainder);

    }
    
}
