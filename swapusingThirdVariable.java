import java.util.Scanner;
public class swapusingThirdVariable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        System.out.println("Enter First number= ");
        int num1=scanner.nextInt();

        System.out.println("Enter Second number= ");
        int num2=scanner.nextInt();

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping: num1= "+num1+", num2="+num2);

    }
    
}

