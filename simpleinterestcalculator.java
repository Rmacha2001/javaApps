import java.util.Scanner;
public class simpleinterestcalculator {
    public static void main(String [] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter principal amount= ");
        double principal=scanner.nextDouble();

        System.out.println("Enter rate of interest= ");
        double rate=scanner.nextDouble();

        System.out.println("Enter time (in years)= ");
        double time=scanner.nextDouble();

        double simpleInterest=(principal*time*rate)/100;
        System.out.println("Simple Interest= "+simpleInterest);
    }
    
}
