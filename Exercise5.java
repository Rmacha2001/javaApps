public class Exercise5 {
    public static void main(String[] args) {
        int num =-2;

        if(num>0){
            System.out.println("Positiove");
        }
        else if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        int month =5;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        for (int i=2;i<=20;i+=2)
        {
            System.out.println(i);
        }
        Scanner scanner = new Scanner (System.in);
        int num=scanner.nextint();
        while(num!=0)
        {
            System.out.println("you entered= "+num);
        }
    }
    
}
