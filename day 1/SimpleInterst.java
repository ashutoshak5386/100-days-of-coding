import java.util.Scanner;
public class SimpleInterst {
    public static void main(String[] args) {
        float p,r,t,si;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        
        p = scan.nextFloat();

        System.out.println("Enter rate: ");
       
        r = scan.nextFloat();

        System.out.println("Enter time: ");
        
        t = scan.nextFloat();

        si  = (p*r*t)/100; 

        System.out.println("Simple interest = " + si);

        scan.close();


    }
}
