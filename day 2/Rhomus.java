import java.util.Scanner;
public class Rhomus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d1,d2,area;

        System.out.println("Enter the diagonal 1: ");
        d1 = sc.nextFloat();

        System.out.println("Enter the diagonal 2: ");
        d2 = sc.nextFloat();

        area = (d1 * d2)*1/2;

        System.out.println("area: "+area);
        sc.close();

    }
    
}
