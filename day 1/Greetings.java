import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        System.out.print("enter the name: ");

    Scanner scan = new Scanner(System.in);
    String a = scan.next();

        System.out.println(  " good morning " + a );

        scan.close();
   
    }
    
}
