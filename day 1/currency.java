import java.util.Scanner;
public class currency{
    public static void main(String[] args) {
        float a;
        System.out.println("Enter the amount");

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        float b = 79;
        float c = a/b;
        System.out.println(c);

        scan.close();

    }
}
