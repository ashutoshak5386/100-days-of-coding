
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a name of fruit");
        String fruit = in.next();
        
        
       switch(fruit){
        case "mango":
        System.out.println("king of fruits");
        break;

        case "apple":
        System.out.println("A sweet fruit");
        break;

        case "orange":
        System.out.println("round fruit");
        break;

        case "Grapes":
        System.out.println("small fruit");
        break;

        default:
        System.out.println("please entere a valid fruit");

       }
       //enhanced switch
       
       System.out.println("enter a number");

        int day = in.nextInt();
       switch (day){
        case 1,2,3,4,5 -> System.out.println("Weekdays");
        case 6,7 -> System.out.println("weekend");
       }
        in.close();
    }
}
