import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

            in.close();
        }
        System.out.println("the "+n+"th fibonaci number is "+b);
    }
}
