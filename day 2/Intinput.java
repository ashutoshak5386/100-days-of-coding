import java.util.Scanner;
public class Intinput {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter the numbers: ");

        while((a = sc.nextInt()) != 0) {
            a = sc.nextInt();
        }
        System.out.print(a);
        sc.close();
    }
        
}
