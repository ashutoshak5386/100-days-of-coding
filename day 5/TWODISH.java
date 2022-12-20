import java.util
import java.util.Scanner;
public class TWODISH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int dishes = sc.nextInt();
            int fruit = sc.nextInt();
            int veg = sc.nextInt();
            int fishes = sc.nextInt();
             if(veg>= dishes && (fruit+fishes) >= dishes) 
		        System.out.println("YES");
            else
                System.out.println("NO");


        }

    }
}