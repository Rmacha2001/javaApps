import java.util.Scanner;
public class square_cubeofnumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number= ");
        double number=scanner.nextDouble();

        double square=number*number;
        double cube=number*number*number;

        System.out.println("Square of number= "+square);
        System.out.println("Cube of number= "+cube);
    }
    
}
