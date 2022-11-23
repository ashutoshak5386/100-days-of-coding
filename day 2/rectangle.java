import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b,area;
        System.out.println("enter the  length : ");
         l = sc.nextInt();
         System.out.println("Enter the breadth : ");
         b = sc.nextInt();
        area = l*b;
        System.out.println("Area: " + area);

        sc.close();
        

    }
    
}
