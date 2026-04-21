public class Exercise4 {
    public static void main(String [] args) {

        int num1=15;
        int num2=4;

        System.out.println("num1+num2= " +(num1+num2));
        System.out.println("num1/num2= " +(num1/num2));
        System.out.println("num1%num2= " +(num1%num2));
        
        int counter=5;
        System.out.println("Initial counter: " + counter);
        System.out.println("pre-increment(++counter)= " + ++counter);
        System.out.println("After pre-increment= " + counter);
        System.out.println("post-increment(counter++)= "+ counter++);
        System.out.println("After post-increment= " + counter);
        Boolean isHot=true;
        Boolean isHumid=false;
        System.out.println("isHot && isHumid= " +(isHot && isHumid));
        System.out.println("isHot || isHumid= "+(isHot || isHumid));
        System.out.println("!isHot= " + !isHot);

        int score=75;
        String result=(score>=60)? "passing":"failing";
        System.out.println("score result= "+ score);
    }
    
}
