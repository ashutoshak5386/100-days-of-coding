import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {
        float b,h,area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base:");
        b = sc.nextFloat();

        System.out.print("Enter the height:");
        h = sc.nextFloat();

        area = ( b*h) / 2 ;

        System.out.print("The area of the triangle is "+area);
        sc.close();

    }
}
