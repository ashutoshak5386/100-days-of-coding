import java.util.Scanner;


public class Largestnum {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");

        
        a = scan.nextInt();

        System.out.println("Enter 2nd number");

        
        b = scan.nextInt();

        
        if(a>b){
            System.out.println(a+" is greater number");
        }
        
        else{
            System.out.println(b + " is greater number");
        } 

        scan.close();
    }
    
}
