import java.util.Scanner;


public class Calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a,b;
        
        
        System.out.print("Enter 1st number: ");

       
        a = sc.nextFloat();

        System.out.print("Enter 2nd number: ");

        
        b = sc.nextFloat();

        System.out.println("Enter the operation");
		System.out.println("For addition + ");
		System.out.println("For subtraction - ");
		System.out.println("For multiplication * ");
		System.out.println("For division / : ");

        
        char c = sc.next().charAt(0);

        if(c == '+') {
			System.out.println("The summation of "+a+" and "+b+" = "+(a+b));
		}else if(c == '-') {
			System.out.println("The subtraction of "+a+" and "+b+" = "+(a-b));
		}else if(c == '*') {
			System.out.println("The multiplication of "+a+" and "+b+" = "+(a*b));
		}else if(c == '/') {
			System.out.println("The division of "+a+" and "+b+" = "+(a/b));
		}else {
			System.out.println("Invalid Input");
		}

        sc.close();


    }
}
