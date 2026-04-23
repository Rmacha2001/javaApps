import java.util.Scanner;
public class Daysconversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of days= ");
        int days=scanner.nextInt();

        int years=days/365;
        int months=(days%365)/30;
        int remainingDays=days%365%30;

        System.out.println("years= "+years);
        System.out.println("Months= "+months);
        System.out.println("remaining days= "+remainingDays);
    }
    
}
