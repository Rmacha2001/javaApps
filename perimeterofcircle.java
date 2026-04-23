import java.util.Scanner;
public class perimeterofcircle {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println(" Enter raius of circle= ");
        double radius=scanner.nextDouble();

        double perimeter=2*3.14*radius;
        System.out.println("Perimeterofcircle= "+perimeter);
    }
    
}
