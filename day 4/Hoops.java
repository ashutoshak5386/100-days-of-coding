import java.util.Scanner;
public class Hoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,t;
        t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            num = n-1/2;
            System.out.println(num);
            t--;

        }
        sc.close();
    }
}
