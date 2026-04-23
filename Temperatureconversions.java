import java.util.Scanner;
public class Temperatureconversions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter temperature in celcius= ");
        double celcius=scanner.nextDouble();

        double fahrenheit=(celcius*9/5)+32;
        System.out.println("Temperature in fahrenheit= " + fahrenheit);
        
        System.out.println("Enter temperature in fahrenheit= ");
        double f=scanner.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("Temperatutre in celcius= "+celcius);

    }
    
}
